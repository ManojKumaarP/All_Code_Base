package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class SizeCheckMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailTextField = driver.findElement(By.id("email"));
		
		Dimension sizeOFEmail = emailTextField.getSize();
		
		int heightOFEmail = sizeOFEmail.height;
		
		int widthOfEmail = sizeOFEmail.width;
		
		WebElement passWordTextField = driver.findElement(By.id("passContainer"));
		
		Dimension sizeOfPass = passWordTextField.getSize();
		
		int heightOFPass = sizeOfPass.height;
		
		int widthOFPass = sizeOfPass.width;
		
		if(heightOFEmail==heightOFPass && widthOfEmail==widthOFPass)
		{
			System.out.println("Pass : The Email and pasword size are same");
			
		}
		else
			System.out.println("Fail : The Email and pasword size are not same");
		
		
		driver.quit();
		
		
	}

}
