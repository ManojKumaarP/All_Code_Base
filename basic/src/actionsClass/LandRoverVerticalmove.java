package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LandRoverVerticalmove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.landrover.in/discovery/index.html");
		WebElement rANGEROVEREVOQUE = driver.findElement(By.xpath("(//p[text()='RANGE ROVER EVOQUE'])[1]"));
		WebElement nEWRANGEROVERVELAR = driver.findElement(By.xpath("(//p[text()='NEW RANGE ROVER VELAR'])[1]"));
		WebElement rANGEROVERSPORT = driver.findElement(By.xpath("(//p[text()='RANGE ROVER SPORT'])[1]"));
		WebElement rANGEROVER = driver.findElement(By.xpath("(//p[text()='RANGE ROVER'])[1]"));
		WebElement vEHICLES = driver.findElement(By.xpath("//span[text()='VEHICLES']"));
		Actions actions = new Actions(driver);
		WebElement dEFENDER130 = driver.findElement(By.xpath("(//p[text()='DEFENDER 130'])[1]"));
		WebElement dEFENDER110 = driver.findElement(By.xpath("(//p[text()='DEFENDER 110'])[1]"));
		WebElement dEFENDER90 = driver.findElement(By.xpath("(//p[text()='DEFENDER 90'])[1]"));
		WebElement dISCOVERYSPORT = driver.findElement(By.xpath("(//p[text()='DISCOVERY SPORT'])[1]"));
		WebElement dISCOVERY = driver.findElement(By.xpath("(//p[text()='DISCOVERY'])[1]"));
		
		vEHICLES.click();
		
		actions.moveToElement(rANGEROVEREVOQUE, 0, 0).pause(1000).moveToElement(rANGEROVEREVOQUE, 0, 56).pause(1000).moveToElement(nEWRANGEROVERVELAR, 0, 56).pause(1000).moveToElement(rANGEROVERSPORT, 0, 56).pause(1000).moveToElement(rANGEROVER, 0, 72).pause(1000).moveToElement(dEFENDER130, 0, 56).pause(1000).moveToElement(dEFENDER110, 0, 56).pause(1000).moveToElement(dEFENDER90, 0, 72).pause(1000).moveToElement(dISCOVERYSPORT, 0, 56).perform();
		
		driver.manage().window().minimize();
		driver.quit();
		
		}

}
