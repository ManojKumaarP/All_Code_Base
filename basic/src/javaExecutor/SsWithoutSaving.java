package javaExecutor;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SsWithoutSaving {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File tempSs = ts.getScreenshotAs(OutputType.FILE);
	    String sysPath = tempSs.getAbsolutePath();
	    System.out.println(sysPath);
	    Thread.sleep(20000);
	    }

}
