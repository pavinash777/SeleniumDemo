package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCurrentURL {

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
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        String actUrl = driver.getCurrentUrl();
        
        if(actUrl.equalsIgnoreCase(expUrl)) {
        	System.out.println("Test Case Pass");
        }else {
        	System.out.println("Testcase failed");
        }
        

        // Close the browser
        driver.close();
    }

}
