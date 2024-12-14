package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreAndPostConditions {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
			
		//Trigger the main Url
		driver.get("https://www.dassault-aviation.com/en/");
		
		Thread.sleep(1500);
		//pre Condition Maximize the window
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		//Post Condition minimize the window
		driver.manage().window().minimize();
		
		
		
	}

}
