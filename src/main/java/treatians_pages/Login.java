package treatians_pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;

import generic_utilities.Base_Class;
import generic_utilities.ReadExcel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login extends Base_Class{
	
	public Login(AndroidDriver driver) {
	
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
    public WebElement menu;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log in\")")
    public WebElement login;
	@AndroidFindBy(xpath="//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement Email_text_field;
	@AndroidFindBy(xpath="//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement password_text_field;
	@AndroidFindBy(xpath="//android.widget.ListView/android.view.View[3]/android.view.View/android.view.View")
    public WebElement signin;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log out\")")
	public WebElement logout;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Successfully loggedin\")")
	public WebElement successfully_loggedin;
	
	
	public void menu() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
		menu.click();
		}
	
	public void enteremail() {
		//ReadExcel obj = new ReadExcel();
		//String un =obj.RExcel("Sheet 1", 1, 0);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(Email_text_field)));
		Email_text_field.click();
		//Email_text_field.sendKeys(un);
	}
	
	public void enterpassword() {
		//ReadExcel obj = new ReadExcel();
		//String pw =obj.RExcel("Sheet 1", 1, 1);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(password_text_field)));
		password_text_field.click();
		//password_text_field.sendKeys(pw);
	}
	public void signin() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signin)));
		signin.click();
		}
	public void login() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(login)));
		login.click();
		}
	public void logout() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
		logout.click();
		}
	public void loop() throws InterruptedException {
	for(int i=1; i<=3; i++) {
		driver.activateApp("com.treatians");
		System.out.println(i);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
		menu.click();
		System.out.println("menu clicked");
		WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitl.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(login)));
		login.click();
		System.out.println("login clicked");
		ReadExcel obj = new ReadExcel();
		String un =obj.RExcel("Sheet 1", i, 0);
		String pw =obj.RExcel("Sheet 1", i, 1);
		System.out.println(un+" "+pw);
		WebDriverWait waitu = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitu.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(Email_text_field)));
		Email_text_field.sendKeys(un);
		System.out.println("email entered");
		
		WebDriverWait waitp = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitp.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(password_text_field)));
		password_text_field.sendKeys(pw);
		System.out.println("password entered");
		WebDriverWait waits = new WebDriverWait(driver,Duration.ofSeconds(20));
		waits.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(signin)));
		signin.click();
		System.out.println("signin clicked");
		WebDriverWait waitm = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitm.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
		menu.click();
		System.out.println("menu clicked");
		WebDriverWait waitlo = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitlo.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
		logout.click();
		System.out.println("logout clicked");
		Thread.sleep(2000);
		driver.terminateApp("com.treatians");
		
		}
	}
}
