package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usrNameTxtField = driver.findElement(By.id("username"));
		String value = usrNameTxtField.getAttribute("value");
		
		if(value.isEmpty())
		{
			System.out.println("The text field is empty");
			usrNameTxtField.sendKeys("admin");
		}
		else
			System.out.println("The text field is filled");
	}

}
