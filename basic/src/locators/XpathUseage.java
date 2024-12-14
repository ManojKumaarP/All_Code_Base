package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUseage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
		String expectedTitle = "Welcome to the Find By Playground";
		WebElement a50 = driver.findElement(By.xpath("//a[@id=\"a50\"]"));
		a50.click();
		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Success :Title matched ");
		else
			System.out.println("Fail :Title Did not match");
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
