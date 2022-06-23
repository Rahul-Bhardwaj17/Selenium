package swagWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class SwagWebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver 3");
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	    driver.get("https://www.saucedemo.com/");
	  // WebElement username=driver.findElement(By.xpath("//div/h4/following-sibling::br[2]"));
	  // String user= driver.findElement(with(By.tagName("br")).above(username)).getText();
	  // System.out.println(user);
	  System.out.println(driver.findElement(By.xpath("//div[text()='standard_user']")).getText());
	 
	    
	    Thread.sleep(3000);
	   // driver.findElement(By.id("user-name")).sendKeys());
	    /*
	    String password=driver.findElement(By.xpath("//h4[text()='secret_sauce']")).getText();
	    Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		*/
		
		
		
	}
	

}
