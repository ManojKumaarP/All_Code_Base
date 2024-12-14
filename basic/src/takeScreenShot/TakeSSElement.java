package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSSElement {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String timeStamp = LocalDateTime.now().toString().replace(":", "-");
	driver.get("https://www.facebook.com/");
	WebElement targetEle = driver.findElement(By.xpath("//a[text()='Create new account']"));
	File tempSS = targetEle.getScreenshotAs(OutputType.FILE);
	File premSs= new File("./errSS/"+timeStamp+"CreateAcc.png");
	FileUtils.copyFile(tempSS, premSs);
	driver.manage().window().minimize();
	driver.quit();
	System.out.println("Sucess");
	
	
}
}
