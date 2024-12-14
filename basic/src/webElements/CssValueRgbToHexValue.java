package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class CssValueRgbToHexValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
			
		
		String backgroundColor = loginButton.getCssValue("background-color");
		
		System.out.println(backgroundColor);
		
		String value =Color.fromString(backgroundColor).asHex();
		
		System.out.println(value);
		
		driver.quit();
		
		

	}

}
