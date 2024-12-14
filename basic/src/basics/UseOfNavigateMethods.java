package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfNavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Instantiate the browser specific class
				WebDriver driver = new ChromeDriver();
					
				//Trigger the main Url
				driver.get("https://www.dassault-aviation.com/en/");
				
				Thread.sleep(1500);
				//pre Condition Maximize the window
				
				driver.manage().window().maximize();
				Thread.sleep(1500);
				
				//Navigate to Groups page
				driver.navigate().to("https://www.dassault-aviation.com/en/group/");
				Thread.sleep(1500);
				
				//Navigate to  Civil
				driver.navigate().to("https://www.dassault-aviation.com/en/civil/");
				Thread.sleep(1500);
				
				
				//Navigate to Passion page
				driver.navigate().to("https://www.dassault-aviation.com/en/passion/");
				Thread.sleep(1500);
				
				//Navigate to Space page
				driver.navigate().to("https://www.dassault-aviation.com/en/space/");
				Thread.sleep(1500);
				
				//Navigate to Defense page
				driver.navigate().to("https://www.dassault-aviation.com/en/group/");
				Thread.sleep(1500);
				
				driver.navigate().refresh();
				Thread.sleep(1500);
				
				//Post Condition minimize the window
				driver.manage().window().minimize();
				driver.quit();
				
	}

}
