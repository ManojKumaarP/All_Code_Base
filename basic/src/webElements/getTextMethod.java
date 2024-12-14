package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement keepLoggedInCheckBoxCheckBox = driver.findElement(By.id("keepLoggedInLabel"));
		
		String expectedTxt = "Keep me logged in";
		
		String actualText = keepLoggedInCheckBoxCheckBox.getText();
		
		if(actualText.equals(expectedTxt))
		{
			System.out.println("Pass : Tag text present as per requirements");
		}
		
		else
		{
			System.out.println("Fail : Tag Text Not present as per requirements");
		}
		
		driver.manage().window().minimize();
		
		driver.quit();
		
	}
	


}
