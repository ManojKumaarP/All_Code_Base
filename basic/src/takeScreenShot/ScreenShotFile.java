package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotFile {
 public static void main(String[] args) throws IOException {
	
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	 driver.get("https://www.itchotels.com/in/en/itcgrandchola-chennai");
     TakesScreenshot ts = (TakesScreenshot)driver;
     File tempFile = ts.getScreenshotAs(OutputType.FILE);
     File premFile = new File("./errSS/itcGrandChola.png");
     FileUtils.copyFile(tempFile, premFile);
     driver.manage().window().minimize();
     driver.quit();  
     System.out.println("Sucess");
}
}
