package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
		//WebElement firstNAmeTextField = driver.findElement(By.cssSelector("input[name='firstname']"));
		WebElement firstNAmeTextField = driver.findElement(By.cssSelector("input[aria-label='First name']"));
		firstNAmeTextField.sendKeys("QSPIDERS BTM");

	}

}
