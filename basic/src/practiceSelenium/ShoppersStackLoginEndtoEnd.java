package practiceSelenium;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppersStackLoginEndtoEnd {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Pre Condition
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String timeStamp = LocalDateTime.now().toString().replace(":","-");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		
		//LoginPage
		driver.get("https://shoppersstack.com/");
		wait.until(ExpectedConditions.urlToBe("https://shoppersstack.com/"));
		WebElement loginBtn = driver.findElement(By.id("loginBtn"));
		wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
		loginBtn.click();
		
		//userName 
		wait.until(ExpectedConditions.urlToBe("https://shoppersstack.com/user-signin"));
		WebElement emailTxtField = driver.findElement(By.id("Email"));
		emailTxtField.sendKeys("manojkumar1998@gmail.com");
		
		//passWord
		WebElement passwordtxtField = driver.findElement(By.id("Password"));
		passwordtxtField.sendKeys("Manoj@gmail1");
		
		//loginBtn
		
		WebElement logInButton = driver.findElement(By.id("Login"));
		logInButton.submit();
		
		//AccountSettings
		wait.until(ExpectedConditions.urlToBe("https://shoppersstack.com/"));
		WebElement profileBtn = driver.findElement(By.xpath("//button[@aria-label=\"Account settings\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(profileBtn));
		profileBtn.click();
		
		//logoutButton
		TakesScreenshot ts = (TakesScreenshot)driver;
		Thread.sleep(2000);
		File tempFle = ts.getScreenshotAs(OutputType.FILE);
		File premFle =new File("./errSS/"+timeStamp+"ShopperStackLogin.png");
		FileUtils.copyFile(tempFle, premFle);
		WebElement logoutButton = driver.findElement(By.xpath("//li[text()='Logout']"));
//		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		logoutButton.click();
		
		//Post condition
		driver.manage().window().minimize();
		driver.quit();
		System.out.println("Success");
	}

}
