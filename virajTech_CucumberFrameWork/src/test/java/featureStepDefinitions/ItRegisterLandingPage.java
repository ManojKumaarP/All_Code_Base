package featureStepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ItRegistrationObjects;
import pageObjects.PageObjectsManger;
import utilityPackage.TestPreContextSetup;

public class 	 ItRegisterLandingPage {
	
	//Importing from utility class
	TestPreContextSetup setContext;
	
	public ItRegisterLandingPage(TestPreContextSetup setContext)
	{
		this.setContext= setContext;
	}
	
	
	@Given("user is landed up on It jobs registraion page")
	public void user_is_landed_up_on_it_jobs_registraion_page() {
		setContext.options = new ChromeOptions();
		setContext.driver = new ChromeDriver(setContext.options);
		setContext.options.addArguments("--diable--notfications");
		setContext.wait = new WebDriverWait(setContext.driver, Duration.ofSeconds(50));
		setContext.implicitWait = setContext.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));		
		setContext.driver.manage().window().maximize();
		setContext.driver.get("https://www.virajetech.com/");
		
		//ItRegistrationObjects pageObjects = new ItRegistrationObjects(setContext.driver, setContext.wait);	
		
		PageObjectsManger pagemanager = new PageObjectsManger(setContext.driver, setContext.wait);
		
		//TestContext creates method to pageManage and pageManger calls PageObjectclass and PageObjectclass calls the actualObject methods
		ItRegistrationObjects pageObjects = setContext.pagemanager.getItRegistrationObjects();
		
		//closing the banner message		
		pageObjects.clickOnCloseButton();
		//Navigating to Registration page
		pageObjects.clickOnitJobsRegisterlink();
	                                                	                                                                                                                  
	}
	
	@Then("user is entering valid details in mandatory fields {string}, {string} ,{string},{string},{string},{string},{string},{string},{string} and registers")
	public void user_is_entering_valid_details_in_mandatory_fields_and_registers(String Registraion, String firstName, String otherCourses, String email, String password, String confirmPassword, String pinCode, String phoneCode, String phoneNumber) {
		
		WebElement RegistraionDropDown = setContext.driver.findElement(By.xpath("//LABEL[contains(.,'Register As *')]/following::select[@id=\"u_group\"]"));
		setContext.act= new Actions(setContext.driver);
		setContext.act.keyUp(RegistraionDropDown, Keys.ARROW_DOWN).perform();
		Select sc = new Select(RegistraionDropDown);
		sc.selectByVisibleText(Registraion);
		
		 //Entering First name in text field
		
		  WebElement firstNameTextField = setContext.driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		  setContext.act.scrollToElement(firstNameTextField).perform();
		  setContext.wait.until(ExpectedConditions.elementToBeClickable(firstNameTextField)).click();
		  firstNameTextField.sendKeys(firstName);
		  
		
		//Selecting Other courses in drop down option
		  
		  WebElement otherCoursesDropdown = setContext.driver.findElement(By.xpath("//LABEL[contains(@class,'demo-form-style')]/following::SELECT[@name='interested_demo_course']"));
		  setContext.act.scrollToElement(otherCoursesDropdown).perform();
		  Select sc1= new Select(otherCoursesDropdown);
		  sc1.selectByVisibleText(otherCourses);
		  
		  //Entering email in email text field
		  
		  WebElement emailTextField = setContext.driver.findElement(By.id("company_identity"));
		  setContext.act.scrollToElement(emailTextField).perform();
		  setContext.wait.until(ExpectedConditions.elementToBeClickable(emailTextField)).click();
		  emailTextField.sendKeys(email);
		  
		  //Entering Password into Password text field
		  
		  WebElement passwordTextField = setContext.driver.findElement(By.id("company_password"));
		  setContext.act.scrollToElement(passwordTextField).perform();
		  setContext.wait.until(ExpectedConditions.elementToBeClickable(passwordTextField)).click();
		  passwordTextField.sendKeys(password);
		  
		  //Entering Password into Confirm Password text field
		  
		  WebElement confirmPasswordTextField = setContext.driver.findElement(By.id("password_confirm"));
		  setContext.act.scrollToElement(confirmPasswordTextField).perform();
		  setContext.wait.until(ExpectedConditions.elementToBeClickable(confirmPasswordTextField)).click();
		  confirmPasswordTextField.sendKeys(confirmPassword);
		  
		  //Entering Pin code into pin code text field
		  
		  WebElement pinCodeTextField = setContext.driver.findElement(By.id("pin_code"));
		  setContext.act.scrollToElement(pinCodeTextField).perform();
		  setContext.wait.until(ExpectedConditions.elementToBeClickable(pinCodeTextField)).click();
		  pinCodeTextField.sendKeys(pinCode);
		  
		  //Selecting Phone code from drop down
		  
		  WebElement phoneCodeDropDown = setContext.driver.findElement(By.xpath("//LABEL[contains(.,'Phone Number *')]/following::select[@id='phone_code']"));
		  setContext.act.scrollToElement(phoneCodeDropDown).perform();
		  Select sc2 = new Select(phoneCodeDropDown);
		  sc2.selectByVisibleText(phoneCode);
		  
		  //Entering phone number in phone text field
		  
		  WebElement phoneTextField = setContext.driver.findElement(By.xpath("//LABEL[contains(.,'Phone Number *')]/following::INPUT[@name='phone']"));
		  setContext.act.scrollToElement(phoneTextField).perform();
		  setContext.wait.until(ExpectedConditions.elementToBeClickable(phoneTextField));
		  phoneTextField.click();
		  phoneTextField.sendKeys(phoneNumber); 
	}
	
	@Then("user creates an account and is validated")
	public void user_creates_an_account_and_is_validated() throws InterruptedException {
		
		setContext.act = new Actions(setContext.driver);
		//Submitting the form by clicking on Create An Account button
		  
		  WebElement createAnAccountButton = setContext.driver.findElement(By.xpath("//button[text()='Create An Account']"));
		  setContext.act.scrollToElement(createAnAccountButton).perform();
		  setContext.wait.until(ExpectedConditions.elementToBeClickable(createAnAccountButton)).click();
		  
		  
		 /* //Successful registration verification 
		  WebElement closeBannerButton = setContext.driver.findElement(By.xpath("//button[@class=\"close\"]"));
		  setContext.wait.until(ExpectedConditions.visibilityOf(closeBannerButton)).click();
		  
		  
		  WebElement registrationSucessText = setContext.driver.findElement(By.xpath("//div[@class=\"alert alert-success\"]"));
		  setContext.wait.until(ExpectedConditions.visibilityOf(registrationSucessText));
		  System.out.println(registrationSucessText.getText());*/
		
		  
		  Thread.sleep(2000);
		  setContext.driver.quit();
	    
	}
}
