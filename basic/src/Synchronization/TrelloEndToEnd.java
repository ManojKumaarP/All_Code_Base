package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloEndToEnd {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/");
		WebElement loginOption = driver.findElement(By.xpath("//a[text()='Get Trello for free']/preceding-sibling::a[text()='Log in']"));
		loginOption.click();
		Thread.sleep(4000);
		String actualtrelloLoginUrl = driver.getCurrentUrl();
		if (actualtrelloLoginUrl.equals("https://trello.com/login")) {
			WebElement usernameTextField = driver.findElement(By.id("user"));
			usernameTextField.sendKeys("manojkumaar1998@gmail.com");
			WebElement loginButton = driver.findElement(By.id("login"));
			loginButton.submit();
			Thread.sleep(4000);
			System.out.println("Pass: The actualtrelloLoginUrl is as per expected.");
			String actualLoginToContinuePageUrl = driver.getCurrentUrl();
			Thread.sleep(2000);
			if (actualLoginToContinuePageUrl.contains("https://id.atlassian.com/login?application=trello&continue")) {
				WebElement passwordTextField = driver.findElement(By.id("password"));
				passwordTextField.sendKeys("Manoj@gmail1");
				WebElement loginToContinueButton = driver.findElement(By.id("login-submit"));
				loginToContinueButton.submit();
				System.out.println("Pass: The actualLoginToContinuePageUrl is as per expected.");
				Thread.sleep(3000);
				String actualBoardsPageUrl = driver.getCurrentUrl();
				if (actualBoardsPageUrl.equals("https://trello.com/u/letsuccessmakesnoise/boards")) {
					WebElement profileIcon = driver.findElement(By.xpath("//button[@aria-label='Open member menu']"));
					Thread.sleep(3000);
					profileIcon.click();
					Thread.sleep(2000);
					WebElement logoutOption = driver.findElement(By.xpath("//button/span[text()='Log out']"));
					logoutOption.click();
					Thread.sleep(3000);
					System.out.println("Pass: The actualBoardsPageUrl is as per expected.");
					String actualLogOutPageUrl = driver.getCurrentUrl();
					if (actualLogOutPageUrl.contains("https://id.atlassian.com/logout?continue")) {
						WebElement logoutButton = driver.findElement(By.id("logout-submit"));
						logoutButton.submit();
						System.out.println("Pass: The actualLogOutPageUrl is as per expected. ");
					}else {
						System.out.println("Fail: The actualLogOutPageUrl is not as per expected. ");
					}
					
				}else {
					System.out.println("Fail: The actualBoardsPageUrl is not as per expected.");
				}
			}else {
				System.out.println("Fail: The actualLoginToContinuePageUrl is not as per expected.");
			}
		}else {
			System.out.println("Fail: The actualtrelloLoginUrl is not as per expected.");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
	}

