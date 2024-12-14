package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_02CSS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup/");
		//WebElement mobileNumTextField = driver.findElement(By.cssSelector("input[class='inputtext _58mg _5dba _2ph-']"));
		WebElement mobileNumTextField = driver.findElement(By.cssSelector("input[name='reg_email__']"));
		mobileNumTextField.sendKeys("098765432");
		
	}
}
