package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandielingConfirmAlert {

	public static WebDriver driver;

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
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		Thread.sleep(3000);

		// acceptMethod();

		// Thread.sleep(3000);
		// dismissMethod();
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

		Thread.sleep(3000);

		// Alert window with okay button
		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		String expText = "You successfully clicked an alert";

		String actText = driver.findElement(By.id("result")).getText();

		if (expText.contentEquals(actText)) {
			System.out.println("Test Case Pass: " + actText);
		} else {
			System.out.println("Test Case Fail: " + actText);
		}

		Thread.sleep(3000);

		// Alert window with cancel button

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

		Thread.sleep(3000);

		driver.switchTo().alert().dismiss();

		Thread.sleep(3000);

		String expTextDismiss = "You clicked: Cancel";

		String actTextDismiss = driver.findElement(By.id("result")).getText();

		if (expTextDismiss.contentEquals(actTextDismiss)) {
			System.out.println("Test Case Pass: " + actTextDismiss);
		} else {
			System.out.println("Test Case Fail: " + actTextDismiss);
		}

		// close the WebDriver instance
		driver.quit();

	}

}
