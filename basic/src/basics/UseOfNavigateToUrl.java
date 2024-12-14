package basics;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfNavigateToUrl {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
			
		//Trigger the main Url
		driver.get("https://www.dassault-aviation.com/en/");
		
		Thread.sleep(1500);
		//pre Condition Maximize the window
		
		driver.manage().window().maximize();
		
		Thread.sleep(1500);
		//url String Spec
		URL mainUrl = new URL("https://www.dassault-aviation.com/en/");
		
		URL groupsPage= new URL(mainUrl,"group/");
		System.out.println(groupsPage);
		//URL(Context/spec);
		
		driver.navigate().to(groupsPage);
		Thread.sleep(1500);
		
		driver.manage().window().minimize();
		
		
	}

}
