package practiceSelenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesSS2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://www.incredibleindia-tourism.org/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempfle = ts.getScreenshotAs(OutputType.FILE);
		File premFle = new File(("./errSS/IncredibleIndia.png"));
		FileUtils.copyFile(tempfle, premFle);
		driver.manage().window().maximize();
		driver.quit();
		System.out.println("Sucess");
		
	}

}
