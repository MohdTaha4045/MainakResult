package treatians_pages;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic_utilities.Base_Class;
import generic_utilities.ReadExcel;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Book_Appointments extends Base_Class{
	//private AndroidDriver driver;
	public Book_Appointments(AndroidDriver driver) {
	//this.driver=driver;	
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"menu\")")
	public WebElement menu;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"person circle Log in\"]/android.view.View")
    public WebElement login;
	@AndroidFindBy(xpath="//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement email_text_field;
	@AndroidFindBy(xpath="//android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText")
    public WebElement password_text_field;
	@AndroidFindBy(xpath="//android.widget.ListView/android.view.View[3]/android.view.View/android.view.View")
    public WebElement signin;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"calendar My Appointments\"]/android.view.View")
    public WebElement my_appointments;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"body Doctors\"]/android.view.View")
    public WebElement doctors;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Book Appointment\")")
    public WebElement book_appointment;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"2\")")
    public WebElement today;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.Button).instance(0)")
	public WebElement slotwhenarrownotvisible;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"chevron back\")")
	public WebElement arrow;
	@AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.Button).instance(2)")
	public WebElement slotwhenarrowvisible;
	@AndroidFindBy(xpath="//android.view.View[1]/android.view.View/android.view.View/android.widget.EditText")
    public WebElement search_doctor;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Dr. doctor 1\")")
    public WebElement doctor;
	@AndroidFindBy(xpath="//android.view.View[8]/android.view.View/android.view.View/android.view.View")
    public WebElement patient_log_out;
	@AndroidFindBy(xpath="//android.view.View[6]/android.view.View/android.view.View/android.view.View")
    public WebElement doctor_log_out;
	@AndroidFindBy(xpath="//android.view.View[@content-desc=\"calendar My Appointments\"]/android.view.View")
    public WebElement doctor_appointments;
	@AndroidFindBy(xpath="//android.view.View[2]/android.widget.TextView[1]")
    public WebElement latest_appointment;
	@AndroidFindBy(xpath="//android.view.View[2]/android.widget.TextView[1]")
    public WebElement patient_appointment;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log out\")")
	public WebElement logout;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"January 2023\")")
	public WebElement monthandyear;
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"Adil Rizwi\")")
	public WebElement adil;
	
	
	public void click_on_first_doctor() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(adil)));
		adil.click();
	}
	public void menu() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
		menu.click();
	}
		
		ReadExcel obj = new ReadExcel();
		String un =obj.RExcel("Sheet 1", 1, 0);
		String pw =obj.RExcel("Sheet 1", 1, 1);
		public void login() {
		WebDriverWait waitl = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitl.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(login)));
		login.click();
		}
		public void enter_email() {
		WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(email_text_field)));
		email_text_field.sendKeys(un);
		}
		public void enter_password() {
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(password_text_field)));
		password_text_field.sendKeys(pw);
		}
		public void signin() {
		signin.click();
		}
	public void clickdoctors(){
		
		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(doctors)));
		doctors.click();
	}
	public void search_doctors() {
		WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(search_doctor)));
		search_doctor.click();
		search_doctor.sendKeys("Do");
	}
	public void doctor_click() {
		WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait4.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(doctor)));
		doctor.click();
	}
	public void click_book_appointment() {
		WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait5.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(book_appointment)));
		book_appointment.click();
	}
	public void clickdate() {
		WebDriverWait wait6 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait6.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(today)));
		today.click();
	}
	public void clickslot() {
		PointerInput finger1 = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
		Sequence scrolla = new Sequence(finger1, 1);
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(0),
		PointerInput.Origin.viewport(), 500, 1700));
		scrolla.addAction(finger1.createPointerDown(0));
		scrolla.addAction(finger1.createPointerMove(Duration.ofMillis(500),
		PointerInput.Origin.viewport(),500, 300));
		scrolla.addAction(finger1.createPointerUp(0));
		driver.perform(Arrays.asList(scrolla));
		try {
		if(arrow.isDisplayed()) {
			slotwhenarrowvisible.click();
		}
		}
		catch(NoSuchElementException e) {
			slotwhenarrownotvisible.click();
		}
	}
}
	/*
		WebDriverWait wait8 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait8.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(book_appointment)));
		book_appointment.click();	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(menu)));
		menu.click();
		WebDriverWait waitlo = new WebDriverWait(driver,Duration.ofSeconds(20));
		waitlo.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(logout)));
		logout.click();
		
		*/
	

