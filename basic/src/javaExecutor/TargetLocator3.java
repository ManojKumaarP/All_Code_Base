package javaExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TargetLocator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			driver.get("https://www.google.com/doodles");
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			for(; ;)
			{
				try {
					WebElement targetImg = driver.findElement(By.xpath("//a[text()='Algeria National Day 2023']"));
					targetImg.click();
					break;
				}
				catch (NoSuchElementException e) {
					jse.executeScript("window.scrollBy(0,500)");
				}
	}

	}
}
