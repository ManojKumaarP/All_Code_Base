package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement dblClcikBtn = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(dblClcikBtn).perform();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
