package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAlignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailTextField = driver.findElement(By.id("email"));
		
		Point locationOfEmail = emailTextField.getLocation();
		
		int xaxisOfEmail = locationOfEmail.getX();
		
		System.out.println("xaxisOfEmail :" +xaxisOfEmail);
		
		Dimension sizeOFEmail = emailTextField.getSize();
		
		int widthOfEmail = sizeOFEmail.getWidth();
		
		int leftAlignValueOFEmail=xaxisOfEmail+widthOfEmail;
		
		System.out.println("widthOfEmail : " +widthOfEmail );
		
		System.out.println("leftAlignValueOFEmail : "+leftAlignValueOFEmail);
		//Password texField
		WebElement passWordTextField = driver.findElement(By.id("passContainer"));
		
		Dimension sizeOfpass = passWordTextField.getSize();
		
		int widthOfPass = sizeOfpass.width;
		
		System.out.println("widthOfPass :"+widthOfPass);
		
		Point locationOFPass = passWordTextField.getLocation();
		
		int xaxisOfPass = locationOFPass.getX();
		
		System.out.println("xaxisOfPass :"+xaxisOfPass);
		
		int leftAlignValueOFPass = xaxisOfPass+widthOfPass;
		System.out.println("leftAlignValueOFPass :"+leftAlignValueOFPass);
		
		if(leftAlignValueOFPass==leftAlignValueOFEmail)
		{
			System.out.println("Pass : Email  ana password text field is Left aligned ");
		}
		else
			System.out.println("Fail : Email  ana password text field is not Left aligned ");
		
		driver.manage().window().minimize();
		
		driver.quit();
	}

}
