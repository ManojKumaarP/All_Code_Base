package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TrelloEndToEndWaitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pre Conditions
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Launch The URL
		driver.get("https://trello.com/login");
		wait.until(ExpectedConditions.urlToBe("https://trello.com/login"));
		//User name text field
		WebElement usertxtField = driver.findElement(By.id("user"));
		usertxtField.sendKeys("manojkumaar1998@gmail.com");
		//Continue button
		WebElement continueOption = driver.findElement(By.id("login"));
		continueOption.submit();
		//PassWord
		wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/login?application=trello&continue"));
		WebElement passwordtxtField = driver.findElement(By.id("password"));
		passwordtxtField.sendKeys("Manoj@gmail1");
		WebElement loginButton = driver.findElement(By.xpath("//button[@id=\"login-submit\"]"));
		loginButton.submit();
		//HomePage
		wait.until(ExpectedConditions.urlToBe("https://trello.com/u/manojkumaar/boards"));
		WebElement profileButton = driver.findElement(By.xpath("//button[@aria-label='Open member menu']"));
		wait.until(ExpectedConditions.elementToBeClickable(profileButton));
		profileButton.click();
		WebElement logOutOption = driver.findElement(By.xpath("//button/span[text()='Log out']"));
		wait.until(ExpectedConditions.elementToBeClickable(logOutOption));
		logOutOption.click();
		//LogOut Page
		wait.until(ExpectedConditions.urlContains("https://id.atlassian.com/logout?continue"));
		WebElement logOutButton = driver.findElement(By.id("logout-submit"));
		logOutButton.click();
		//Post Condition 
		driver.manage().window().minimize();
		driver.quit();
		
		
		
		
	}

}
