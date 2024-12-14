package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItRegistrationObjects {
	
	public WebDriver setContextDriver;
	public WebDriverWait setContextwait ;
	
	public ItRegistrationObjects(WebDriver driver,WebDriverWait wait)
	{
		this.setContextDriver = driver;
		this.setContextwait = wait;
	}
	
	//Elements
	By closeButton = By.xpath("//div[@id='ajax-product-modal']//button[@type='button'][normalize-space()='×']");
	By itJobsRegisterlink = By.xpath("//a[text()='IT  Jobs Registration']");
	
	public void clickOnCloseButton()
	{
		setContextwait.until(ExpectedConditions.elementToBeClickable(setContextDriver.findElement(closeButton))).click();
		
	}
	public void clickOnitJobsRegisterlink()
	{
		setContextwait.until(ExpectedConditions.elementToBeClickable(setContextDriver.findElement(itJobsRegisterlink))).click();
		
	}
	
}
