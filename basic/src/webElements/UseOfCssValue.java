package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfCssValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		
		String fontFamily = loginButton.getCssValue("font-family");
		
		System.out.println(fontFamily);
		
		driver.quit();
		
		
	}

}
