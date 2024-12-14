package TestRD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BraveBrowswerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions op = new ChromeOptions();
		op.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(op);
		
		driver.get("https://www.fireflink.com/");
		driver.manage().window().maximize();
		

	}

}
