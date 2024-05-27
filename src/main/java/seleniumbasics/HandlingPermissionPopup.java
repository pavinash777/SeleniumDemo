package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingPermissionPopup {

	public static void main(String[] args) {
		

		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// Create an instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Delete all cookies.
		driver.manage().deleteAllCookies();

		// Maximize the browser.
		driver.manage().window().maximize();

		// Navigate to a website
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		String expText = "Congratulations! You must have the proper credentials.";
		String actText = driver
				.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]"))
				.getText();

		if (actText.contentEquals(actText)) {
			System.out.println("Test Case Pass");
		} else {
			System.out.println("Test Case Fail");
		}

		// close the WebDriver instance
		driver.quit();

	}

}
