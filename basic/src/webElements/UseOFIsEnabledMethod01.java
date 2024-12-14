package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOFIsEnabledMethod01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		
		Thread.sleep(2000);

		WebElement submitButton = driver.findElement(By.name("submit"));
		
		if(submitButton.isEnabled())
		{
			System.out.println("Method : False");
			System.out.println("Appln : True ");
			submitButton.submit();
		}
		else
		{
			WebElement aToSButton = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));

			aToSButton.click();
			
			Thread.sleep(2000);

			WebElement checkBox = driver.findElement(By.id("confbtn"));
			
			Thread.sleep(2000);

			checkBox.click();
			
			WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
			Thread.sleep(2000);
			
			closeButton.click();
			Thread.sleep(2000);

			submitButton.click();
			Thread.sleep(2000);
			
			System.out.println("Done");
			
			
		}
		
		
		
	}

}
