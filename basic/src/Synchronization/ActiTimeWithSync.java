package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeWithSync {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 driver.get("https://demo.actitime.com/login.do");
		 
		 WebElement usernameTxtField = driver.findElement(By.id("username"));
		 
		 usernameTxtField.sendKeys("admin");
		 
		 WebElement pwdTxtField = driver.findElement(By.name("pwd"));
		 pwdTxtField.sendKeys("manager");
		 WebElement loginOption = driver.findElement(By.id("loginButton"));
		 loginOption.click();
		 
		 wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
		 
		 WebElement logoutLink = driver.findElement(By.id("logoutLink"));
		 
		 wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		 
		 logoutLink.click();
		 
		 driver.manage().window().minimize();
		 
		 driver.quit();
		 System.out.println("Sucess");
	}
}
