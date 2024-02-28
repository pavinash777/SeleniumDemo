package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchFirefoxBrowser {


    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
       WebDriverManager.firefoxdriver().setup();

        // Create an instance of the ChromeDriver
        WebDriver driver = new FirefoxDriver();
        
        //Delete all cookies.
        driver.manage().deleteAllCookies();
        
        //Maximize the browser.
        driver.manage().window().maximize();

        // Navigate to a website
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Perform further actions or tests...
       // Verify that the title of the page
        String expTitle = "OrangeHRM";
        String actTitle = driver.getTitle();
        
        if(actTitle.equalsIgnoreCase(expTitle)) {
        	System.out.println("Test Case Pass");
        }else {
        	System.out.println("Testcase failed");
        }
        

        // Close the browser
        driver.quit();
    }

}
