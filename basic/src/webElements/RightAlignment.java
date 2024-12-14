package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailTextField = driver.findElement(By.id("email"));
		
		Point locationOfEmail = emailTextField.getLocation();
		
		int xaxisOfEmail = locationOfEmail.getX();
		
		System.out.println("xaxisOfEmail :" +xaxisOfEmail);
		
		WebElement passWordTextField = driver.findElement(By.id("passContainer"));
		
		Point locationOFPass = passWordTextField.getLocation();
		
		int xaxisOfPass = locationOFPass.getX();
		
		System.out.println("xaxisOfPass :"+xaxisOfPass);
		
		if(xaxisOfEmail==xaxisOfPass)
		{
			System.out.println("Pass : Xaxis of email and password are same");
		}
		else
			System.out.println("Fail : Xaxis of email and password are not same");
		
		driver.manage().window().minimize();
		
		driver.quit();

	}

}
