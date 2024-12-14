package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfGetCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instantiate the specific class
		WebDriver driver = new ChromeDriver();
		
		//Pre Condition
				driver.manage().window().maximize();
				
				//Trigger the app
				driver.get("https://www.dassault-aviation.com/");
				
			String actUrl="https://www.dassault-aviation.com/en/";
			
			String expectUrl=driver.getCurrentUrl();
			
			if(actUrl.equals(expectUrl))
				System.out.println("Pass : The Expected Url is verified and found correct ");
			else
				System.out.println("Fail : The Expected URL is verified and found Incorrect ");
			
			//Post Condition
			driver.manage().window().minimize();
			driver.quit();
	}

}
