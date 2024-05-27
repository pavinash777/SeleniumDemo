package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPromteAlert {

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

		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

		Thread.sleep(3000);

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println(alertText);

		alert.sendKeys("Welcome to Code Collaborate");

		alert.accept();

		Thread.sleep(3000);

		String expText = "You entered: Welcome to Code Collaborate";

		String actText = driver.findElement(By.id("result")).getText();

		if (actText.contentEquals(actText)) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

		// close the WebDriver instance
		driver.quit();

	}

}
