package actionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement LoginBtn = driver.findElement(By.name("login"));
		
		Actions act = new Actions(driver);
		
		//act.contextClick(LoginBtn).perform();
		//act.click(LoginBtn).perform();
		//act.contextClick().perform();
		
		WebElement passTxtField = driver.findElement(By.name("pass"));
		act.sendKeys(passTxtField, "sakhfdiahd").perform();
		
		Thread.sleep(1000);
		driver.quit();
	}

}
