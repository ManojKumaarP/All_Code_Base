package practiceSelenium;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesDassault {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dassault-aviation.com/en/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.dassault-aviation.com/en/group/");
		
		driver.get("https://www.dassault-aviation.com/en/space/");
		
		Set<String> allWid = driver.getWindowHandles();
		
		for(String wid : allWid)
		{
			int c=1;
			String cTitle=driver.switchTo().window(wid).getTitle();
			System.out.println("Window number = "+c+"Window Id is"+wid);
			c++;
			System.out.println();
			if(wid.equals("Dassault Aviation, a major player to aeronautics"))
			{}
			else if(wid.equals("Space - Dassault Aviation"))
			{}
			else if(cTitle.equals("News and information on the Dassault Aviation Group"))
			{
				Dimension sizeofWid = driver.manage().window().getSize();
				
				int height = sizeofWid.getHeight();
				System.out.println("Height :"+ height);
				
				int width = sizeofWid.getWidth();
				System.out.println("Width : "+width);
				
				Point posOfWid = driver.manage().window().getPosition();
				int x=posOfWid.getX();
				int y=posOfWid.getY();
				System.out.println("X is :"+x+" y is :"+y);
				
				Thread.sleep(2000);
				Dimension newPos = new Dimension(100, 100);
				driver.manage().window().setSize(newPos);
				
				Thread.sleep(2000);
				
				Point defPos = new Point(300, 50);
				driver.manage().window().setPosition(defPos);
				
				Thread.sleep(2000);
				driver.close();
				Thread.sleep(2000);
				driver.quit();
				
			}
			
		}
		
		
	}

}
