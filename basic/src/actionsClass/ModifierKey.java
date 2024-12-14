package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ModifierKey {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		Actions actions = new Actions(driver);
		WebElement usernametxtField = driver.findElement(By.id("username"));
		
		actions.keyDown(usernametxtField, Keys.CONTROL).pause(1000).sendKeys("a").pause(1000).sendKeys(usernametxtField, Keys.BACK_SPACE).keyUp(usernametxtField, Keys.CONTROL).keyDown(usernametxtField, Keys.SHIFT).sendKeys(usernametxtField,"Admin").keyUp(usernametxtField, Keys.SHIFT).build().perform();
		
		//actions.keyDown(usernametxtField, Keys.CONTROL).pause(1000).sendKeys("a").pause(1000).sendKeys(usernametxtField, Keys.BACK_SPACE).keyDown(usernametxtField,Keys.SHIFT).sendKeys(usernametxtField,"admin").keyUp(usernametxtField, Keys.SHIFT).build().perform();
		driver.quit();
		
	}
}
