package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateRefreshMethod {

	public static void main(String[] args) throws InterruptedException {
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
        
       // Refreshes the page
       driver.navigate().refresh();
        
        
        Thread.sleep(3000);
        // Close the browser
        driver.quit();

	}

}
