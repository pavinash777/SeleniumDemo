package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathClass {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		// Create an instance of the ChromeDriver
		driver = new ChromeDriver();

		// Delete all cookies.
		driver.manage().deleteAllCookies();

		// Maximize the browser.
		driver.manage().window().maximize();

		// Navigate to a website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(2000);
		
		typesOfXpath();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
	
	public static void typesOfXpath() {
		WebElement ele = driver.findElement(By.xpath("//input[@name='username']"));
		ele.sendKeys("Avinash");
	}

}
