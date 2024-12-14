package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelectedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement keepLoggedInCheckBoxCheckBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		if (keepLoggedInCheckBoxCheckBox.isSelected())
		{
			System.out.println("Fail");
			}
		else
		{
			System.out.println("Pass");
			keepLoggedInCheckBoxCheckBox.click();
		}
		driver.quit();
	}
	
	
}
