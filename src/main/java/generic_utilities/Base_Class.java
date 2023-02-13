package generic_utilities;

import static org.bytedeco.javacpp.lept.pixDestroy;
import static org.bytedeco.javacpp.lept.pixRead;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.lept.PIX;
import org.bytedeco.javacpp.tesseract.TessBaseAPI;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.qameta.allure.Allure;

public class Base_Class {
	public static AndroidDriver driver;
	@BeforeClass
	public void setup() throws MalformedURLException{
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Z585R8TSRWQKSGQO");
	//dc.setCapability("appPackage", "com.treatians");
	//dc.setCapability("appActivity", "com.treatians.MainActivity");
	dc.setCapability("noReset", true);
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
   driver = new AndroidDriver(url,dc);
   }
	public String string;
	public void failed_test(String testMethodName, AndroidDriver driver) throws IOException {
		Base_Class.driver=driver;
		File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String scrFile1name=d.toString().replace(":","_").replace(" ", "_");
		FileUtils.copyFile(scrFile1, new File(".\\treatians_screenshots\\"+testMethodName+"_"+scrFile1name+".png"));
	    Allure.attachment("Screenshot", new ByteArrayInputStream(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES)));
	}
	public void ocr_test_shot(AndroidDriver driver) throws IOException{
		Base_Class.driver=driver;
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String scrFile2name=d.toString().replace(":","_").replace(" ", "_");
		FileUtils.copyFile(scrFile2, new File(".\\"+scrFile2name+".png"));
		File destFile=new File(".\\"+scrFile2name+".png");
		String fileName=destFile.getName();
		BytePointer outText;
        TessBaseAPI api = new TessBaseAPI();
     // Initialize tesseract-ocr with English, without specifying tessdata path
        if (api.Init(".", "ENG") != 0) {
            System.err.println("Could not initialize tesseract.");
            System.exit(1);
        }
		// Open input image with leptonica library
        PIX image = pixRead(fileName);
        api.SetImage(image);
        // Get OCR result
        outText = api.GetUTF8Text();
        this.string = outText.getString();
        System.out.println("OCR output:\n" + string);
     // Destroy used object and release memory
        api.End();
        outText.deallocate();
        pixDestroy(image);  
        destFile.delete();
	}
	
			
@AfterClass
public void teardown() {
	Allure.step("Server closed");
	driver.quit();
}

}
