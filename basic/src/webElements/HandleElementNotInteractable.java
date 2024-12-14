package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.ByteBuddy;

public class HandleElementNotInteractable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("https://www.myntra.com/");
		 WebElement sweaterButton = driver.findElement(By.xpath("//a[@href=\"/men-sweaters\"]"));
		 
		 sweaterButton.click();
		 
		 
		 
		 
	}
}
