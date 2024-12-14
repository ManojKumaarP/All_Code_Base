package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		Actions act = new Actions(driver);
		WebElement menlink = driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()='Men']"));
		WebElement Womenlink = driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()='Women']"));
		WebElement Kidslink = driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()='Kids']"));
		WebElement homeandLivinglink = driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()='Home & Living']"));
		WebElement beautylink = driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()='Beauty']"));
		WebElement studiolink = driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()='Studio']"));
		
		act.moveToElement(menlink, 0, 0).pause(1000).moveToElement(menlink, 73, 0).moveToElement(Womenlink, 74, 0).pause(1000).moveToElement(Kidslink, 97, 0).pause(1000).moveToElement(homeandLivinglink, 110, 0).perform();
		
	}

}
