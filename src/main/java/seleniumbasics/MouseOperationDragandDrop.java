package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperationDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Set the path to the ChromeDriver executable
		WebDriverManager.chromedriver().setup();

		// Create an instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Delete all cookies.
		driver.manage().deleteAllCookies();

		// Maximize the browser.
		driver.manage().window().maximize();

		// Navigate to a website
		driver.get("<Enter the target URL>");

		// Create an Actions object
		Actions actions = new Actions(driver);

		// Locate WebElement to perform double click
		WebElement ele1 = driver.findElement(By.id("<locator of the element>"));

		// Locate WebElement to perform double click
		WebElement ele2 = driver.findElement(By.id("<locator of the element>"));

		// Double Click the button
		actions.dragAndDrop(ele1, ele2);

		// close the WebDriver instance
		driver.quit();

	}

}
