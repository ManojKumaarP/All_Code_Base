package javaExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CLickActionByjse {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.actitime.com/login.do");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("document.getElementById(\"loginButton\").click()");
	System.out.println("Success");
	
}
}
