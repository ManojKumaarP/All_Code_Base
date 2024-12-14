package javaExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParseAuthToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.fireflink.com/signin?product=fireflink-platform");
		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("manojokcool@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Manoj@gmail2");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		String returnValue = ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("return window.localStorage.getItem('test-optimize-user');").toString();
		System.out.println(returnValue);
		
	}

}
