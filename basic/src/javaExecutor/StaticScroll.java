package javaExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticScroll {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    long heightOfwebpage =(long) jse.executeScript("return document.body.scrollHeight");
	    long widthOfwebpage = (long)jse.executeScript("return document.body.scrollWidth");
	    System.out.println("heightOfwebpage is : "+heightOfwebpage +" widthOfwebpage is : "+widthOfwebpage );
	    driver.manage().window().minimize();
	    driver.quit();
	}
}
