package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSynchronous {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		
		WebElement passTextField = driver.findElement(By.name("pwd"));
		
		WebElement loginOption = driver.findElement(By.id("loginButton"));
		
		usernameTextField.sendKeys("admin");
		
		passTextField.sendKeys("manager");
		
		loginOption.click();
		
		Thread.sleep(3000);
		
		String acutalUrl = driver.getCurrentUrl();
		
		String expectedUrl= "https://demo.actitime.com/user/submit_tt.do";
		
		if(acutalUrl.equals(expectedUrl))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
	
		driver.quit();
	}

}
