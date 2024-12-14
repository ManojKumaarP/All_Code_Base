package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagTextMethod {
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("http://vtiger-demo.it-solutions4you.com/");
		 
		 WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		 
		 String actualResult = signInButton.getTagName();
		 
		 String expectedResult = "button";
		 
		 if(actualResult.equals(expectedResult))
		 {
			 System.out.println("Pass");
		 }
		 else
		 {
			 System.out.println("Fail");
		 }
		 
		 driver.quit();
	}
	
}
