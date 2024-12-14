package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGet {

	public static void main(String[] args) {
		
		//Instantiate the browser specific class
		WebDriver driver = new ChromeDriver();
		
		//Trigger the app
				driver.get("https://www.dassault-aviation.com/");
		
		//Pre Condition
		driver.manage().window().maximize();
		
		String expTitile="Dassault Aviation, a major player to aeronautics";
		
		System.out.println("Expected Title :"+expTitile);
		
		String actTtitle=driver.getTitle();
		
		System.out.println("The Actual Titile :"+actTtitle);
		
		if(actTtitle.equals(expTitile))
		{
			System.out.println("Pass : The Expected titile is verified and found correct ");
		}
		else
			System.out.println("Fail : The Expected titile is verified and found Incorrect ");
		
	}
}
