package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOFIsEnabledMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		
		if (loginButton.isEnabled())
		{
			System.out.println("Method : True");
			
			System.out.println("Application : True");
			
			loginButton.submit();
		}
		else
		{
			System.out.println("Method : False");

			System.out.println("Application : False");
		}
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
