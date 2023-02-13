package treatians_pages;

import java.time.Duration;
import java.util.Arrays;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic_utilities.Base_Class;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Create_new_user_page extends Base_Class {
	
	public Create_new_user_page(AndroidDriver driver) {
	
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
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"Create new user\"]/android.widget.TextView")
    public WebElement create_new_user;
	@AndroidFindBy(xpath="//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement firstName;
	@AndroidFindBy(xpath="//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement lastName;
	@AndroidFindBy(xpath="//android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement email;
	@AndroidFindBy(xpath="//android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement phone;
	@AndroidFindBy(xpath="//android.view.View[5]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement password;
	@AndroidFindBy(xpath="//android.view.View[6]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement confirmPassword;
	@AndroidFindBy(xpath="//android.view.View[7]/android.view.View/android.view.View/android.view.View/android.view.View")
    public WebElement countryDropDown;
	@AndroidFindBy(xpath="//android.app.Dialog/android.view.View/android.view.View[1]/android.widget.Button[2]")
    public WebElement country1;
	@AndroidFindBy(xpath="//android.view.View[8]/android.view.View/android.view.View/android.view.View/android.view.View")
    public WebElement cityDropDown;
	@AndroidFindBy(xpath="//android.view.View/android.view.View[1]/android.widget.Button[12]")
    public WebElement city1;
	@AndroidFindBy(xpath="//android.view.View[9]/android.view.View/android.view.View/android.view.View/android.widget.TextView")
    public WebElement addressbeforeclick;
	@AndroidFindBy(xpath="//android.view.View[6]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement addressafterclick;
	@AndroidFindBy(xpath="//android.view.View[10]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button")
    public WebElement register;
	
	public void clickOnMenu() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(menu));
    	  menu.click();
	}
	public void clickOnLogin() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(login));
    	  login.click();
	}
	public void enteremail() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(Email_text_field));
		Email_text_field.click();
		Email_text_field.sendKeys("user3@gmail.com");
	}
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(password_text_field));
		//password_text_field.click();
		password_text_field.sendKeys("password");
	}
	public void createNewUser() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(create_new_user));
		create_new_user.click();
		}
	public void enterFirstName() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(firstName)));
		//firstName.click();
		firstName.sendKeys("user");
	}
	public void enterLastName() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(lastName));
		//lastName.click();
	    lastName.sendKeys("6");
	}
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(email));
		//email.click();
	    email.sendKeys("user6@gmail.com");
	}
	public void phone() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(phone));
		phone.click();
	}
	public void enternumber() {
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		driver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	    }
	public void enterpassword() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(password));
	//	password.click();
	    password.sendKeys("password");
	}
	public void confirmpassword() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(confirmPassword));
		//confirmPassword.click();
		confirmPassword.sendKeys("password");
	}
	public void clickcountrydropdown() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(countryDropDown));
		countryDropDown.click();
		}
	public void selectCountry() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(country1));
		country1.click();
		
	}
	public void clickcitydropdown() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(cityDropDown));
		cityDropDown.click();
		}
	public void selectcity() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(city1));
		city1.click();
		}
	public void enterAddress() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(addressbeforeclick));
		addressbeforeclick.click();
		addressafterclick.sendKeys("address");
		}
	public void clickRegister() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
		wait.until(ExpectedConditions.visibilityOf(register));
		register.click();
		}
	
	public void scroll() {
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence scrolla = new Sequence(finger1, 1);
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
		PointerInput.Origin.viewport(), 300, 900));
		scrolla.addAction(finger1.createPointerDown(0));
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(100),
		PointerInput.Origin.viewport(),300, 600));
		scrolla.addAction(finger1.createPointerUp(0));
		driver.perform(Arrays.asList(scrolla));
	}
	public void back() {
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

