package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleFrames {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// Create an instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Delete all cookies.
		driver.manage().deleteAllCookies();

		// Maximize the browser.
		driver.manage().window().maximize();

		// Navigate to a website
		driver.get("https://the-internet.herokuapp.com/iframe");

		Thread.sleep(2000);

		driver.switchTo().frame("mce_0_ifr");

		WebElement text = driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']"));

		text.clear();

		text.sendKeys("Code Collaborate");

		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		String mainFrameHeading = driver
				.findElement(By.xpath("//h3[normalize-space()='An iFrame containing the TinyMCE WYSIWYG Editor']"))
				.getText();

		System.out.println(mainFrameHeading);

		driver.quit();

	}

}
