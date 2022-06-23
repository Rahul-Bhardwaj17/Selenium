package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		String password=getpassword(driver);
		 driver.findElement(By.cssSelector("button[class*='go-to-login-btn']")).click();
		    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		    driver.findElement(By.name("inputPassword")).sendKeys(password);
		    Thread.sleep(2000);
		    driver.findElement(By.id("chkboxTwo")).click();
		    driver.findElement(By.cssSelector("button[type*='submit']")).click();
		    
	}

	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	String password=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String [] passwordarray=password.split("'");
		String passwordarray1=passwordarray[1].split("'")[0];
		return passwordarray1;
		
		
	}
	
}
