package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectsManger {

	public ItRegistrationObjects pageObjects;
	public WebDriver driver;
	public WebDriverWait wait;
	
	public PageObjectsManger(WebDriver driver,WebDriverWait wait)
	{
		this.driver = driver;
		this.wait = wait;
		
	}
	
	public ItRegistrationObjects getItRegistrationObjects()
	{
		pageObjects = new ItRegistrationObjects(driver, wait);
		return pageObjects;
		
	}
}
