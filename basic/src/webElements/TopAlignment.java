package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		
		WebElement emailTextField = driver.findElement(By.name("email"));
		
		Rectangle rectOfEmail = emailTextField.getRect();
		
		Point pointOfEmail = rectOfEmail.getPoint();
		
		int yaxisOfEmail = pointOfEmail.getY();
		
		System.out.println("yaxisOfEmail :"+yaxisOfEmail );
		
		Dimension sizeofEmail = emailTextField.getSize();
		
		int heightOfEmail = sizeofEmail.height;
		
		System.out.println("heightOfEmail : "+heightOfEmail);
		
		int emailYSize = yaxisOfEmail+heightOfEmail;
		
		System.out.println("emailYSize :"+emailYSize);
		
		WebElement passWordTextField = driver.findElement(By.name("pass"));
		
		Dimension sizeOfpass = passWordTextField.getSize();
		
		int heightOfPass = sizeOfpass.height;
		
		System.out.println("heightOfPass :"+heightOfPass);
		
		Point locationOFPass = passWordTextField.getLocation();
		
		int yaxisOfPass = locationOFPass.getY();
		
		System.out.println("yaxisOfPass :"+ yaxisOfPass);
		
		int passYZize = heightOfPass+yaxisOfPass;
		
		System.out.println("passYZize : "+passYZize);
		
		if(passYZize==emailYSize)
		{
			System.out.println("Pass : Email and password text field Y axis is aligned correct");
		}
		else
			System.out.println("Fail : Email and password text field Y axis is aligned Injcorrect");
		
		driver.manage().window().minimize();
		
		driver.quit();
	}

}
