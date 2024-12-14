package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfClearMethod {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		WebElement userNameTxtField = driver.findElement(By.xpath("//input[@id=\"username\"]"));
		Thread.sleep(2000);
		userNameTxtField.clear();
		Thread.sleep(2000);
		userNameTxtField.sendKeys("admin");
		Thread.sleep(2000);
		WebElement pwdTxtField = driver.findElement(By.xpath("//input[@id=\"password\"]"));
		Thread.sleep(2000);
		pwdTxtField.clear();
		Thread.sleep(2000);
		pwdTxtField.sendKeys("manager");
		WebElement signinbutton = driver.findElement(By.xpath("//button[@class=\"button buttonBlue\"]"));
		Thread.sleep(2000);
		signinbutton.submit();
		
	}
}
