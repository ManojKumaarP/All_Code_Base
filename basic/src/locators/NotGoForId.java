package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NotGoForId {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*When id is Dynmeic
		 * when att value is not mentioned or not present
		 * when att value is lengthy
		 * Id att never will be duplicate
		 * But id att will be dynemic
		 * If Address is mismatch
		 * NoSuchElementException---runtime--unchecked */
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.get("https://www.facebook.com/");
		WebElement emailTextFiled = driver.findElement(By.id("email"));
		emailTextFiled.sendKeys("hello@123");
		Thread.sleep(000);
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();

		
		
	}

}
