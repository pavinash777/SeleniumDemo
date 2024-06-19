package seleniumbasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotGuide {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

				WebDriverManager.chromedriver().setup();

		        // Create an instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();
		        
		        //Delete all cookies.
		        driver.manage().deleteAllCookies();
		        
		        //Maximize the browser.
		        driver.manage().window().maximize();

		        // Navigate to a website
		        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		        
		        Thread.sleep(2000);
		        
		        TakesScreenshot ts =  (TakesScreenshot) driver;
		        
		        
		        // Take the screenshot
		        File src = ts.getScreenshotAs(OutputType.FILE);
		        
		        // Save the screenshot to a desired location
		        File trg = new File(System.getProperty("user.dir")+"//Screenshots//"+"orangehrm.png");
		        
		        //File trg = new File(System.getProperty("user.dir")+"//Screenshots//orangehrm.png");
		        
		        FileUtils.copyFile(src, trg);
		        
		        
		        Thread.sleep(2000);
		        
		        driver.close();

	}

}
