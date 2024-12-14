package utilityPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.PageObjectsManger;

public class TestPreContextSetup {

	public ChromeOptions options;
	public WebDriver driver;
	public WebDriverWait wait ;
	public Timeouts implicitWait;
	public Actions act;
	public PageObjectsManger pagemanager;
	public TestPreContextSetup()
	{
		 pagemanager = new PageObjectsManger(driver,wait);
	}
}
