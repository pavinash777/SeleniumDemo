package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperationMouseHover {

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

		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");

		driver.findElement(By.name("password")).sendKeys("admin123");

		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		Thread.sleep(2000);

		// Create an Actions object
		Actions actions = new Actions(driver);

		// Locate WebElement to perform double click
		WebElement ele1 = driver.findElement(By.linkText("My Info"));

		// Locate WebElement to perform double click
		// WebElement ele2 = driver.findElement(By.linkText("My Profile"));

		// Double Click the button
		actions.moveToElement(ele1).click().build().perform();

		Thread.sleep(3000);

		// close the WebDriver instance
		driver.quit();

	}

}
