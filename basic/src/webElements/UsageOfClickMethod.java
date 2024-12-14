package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClickMethod {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shop.malaicha.com/login");
		Thread.sleep(2000);
		WebElement registerbutton = driver.findElement(By.xpath("//button[text()='Register']"));
		Thread.sleep(3000);
		registerbutton.click();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		driver.quit();
	}

}
