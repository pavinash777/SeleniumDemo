package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrrenshotParticularSection {

	public static void main(String[] args) throws InterruptedException, IOException {
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
		        
		        Thread.sleep(3000);
		        
		        
		        driver.findElement(By.name("username")).sendKeys("Admin");
		        
		        
		        driver.findElement(By.name("password")).sendKeys("admin123");
		        
		        driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		        
		        
		        Thread.sleep(2000);
		        Date d = new Date();
		        
		        String FileName = d.toString().replace(":", "_").replace(" ", "_");
		        
		        WebElement timeSction = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div"));
		
		        //TakesScreenshot ts = (TakesScreenshot) driver;
		        
		        File src = timeSction.getScreenshotAs(OutputType.FILE);
		        
		        // Save the screenshot to a desired location
		        File trg = new File(System.getProperty("user.dir")+"//Screenshots//"+FileName+".png");
		        
		        FileUtils.copyFile(src, trg);
		        
		        Thread.sleep(2000);
		        
		        // Close the browser
		        driver.quit();
		
	}

}
