package javaExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynemicScrolp {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/doodles#archive");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		long hgtOfDoodle = (long)jse.executeScript("return document.body.scrollHeight");
		long wdtOfDoodle = (long)jse.executeScript("return document.body.scrollWidth");
		System.out.println("hgtOfDoodle : "+hgtOfDoodle+ " wdtOfDoodle : "+wdtOfDoodle);
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		long hgtOfDoodle2 = (long)jse.executeScript("return document.body.scrollHeight");
		long wdtOfDoodle2 = (long)jse.executeScript("return document.body.scrollWidth");
		System.out.println("hgtOfDoodle2 : "+hgtOfDoodle2+ " wdtOfDoodle2 : "+wdtOfDoodle2);
		driver.manage().window().minimize(); 
		driver.quit();
		 
	}
}

