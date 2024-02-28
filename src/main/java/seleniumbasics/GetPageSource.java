package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable
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

        // Perform further actions or tests...
       // Verify that the title of the page
       
        String actPageSource = driver.getPageSource();
        
       
        	System.out.println(actPageSource);
        
        

        // Close the browser
        driver.close();
    }
}
