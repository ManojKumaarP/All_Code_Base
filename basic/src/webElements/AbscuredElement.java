package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AbscuredElement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		
		WebElement dontChangeButton = driver.findElement(By.xpath("//span[contains(text(),\"Don't Change\")]/.."
				+ "/input[@type='submit']"));
		Thread.sleep(7000);
		dontChangeButton.click();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		driver.quit();
		
	}

}
