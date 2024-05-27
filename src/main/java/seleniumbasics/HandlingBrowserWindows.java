package seleniumbasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingBrowserWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		// Create an instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Delete all cookies.
		driver.manage().deleteAllCookies();

		// Maximize the browser.
		driver.manage().window().maximize();

		// Navigate to a website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);

		// getting window Id using getWindowHandle()
		String firstWindow = driver.getWindowHandle();
		System.out.println(firstWindow);

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);

		// getting window Id
		Set<String> windowIds = driver.getWindowHandles();

		List<String> allWindowIds = new ArrayList(windowIds);

		String parentWindowId = allWindowIds.get(0);
		String chialdWindowId = allWindowIds.get(1);

		driver.switchTo().window(chialdWindowId);

		System.out.println(driver.getTitle());
		
		

		driver.quit();
	}

}
