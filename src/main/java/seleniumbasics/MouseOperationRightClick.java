package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperationRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Set the path to the ChromeDriver executable
	       WebDriverManager.chromedriver().setup();

	        // Create an instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        
	        //Delete all cookies.
	        driver.manage().deleteAllCookies();
	        
	        //Maximize the browser.
	        driver.manage().window().maximize();

	        // Navigate to a website
	        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	        
	        
	        WebElement element = driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
	        
	        //Create an Actions object
	        Actions actions = new Actions(driver);
	        
	        //perform the right-click action on the element
	        actions.contextClick(element).build().perform();
	        
	        //close the WebDriver instance
	        driver.quit();
	        

	}

}
