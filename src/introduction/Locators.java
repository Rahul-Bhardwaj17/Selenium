package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	String password=getpassword(driver);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@rsa");
    driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
    driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("John@gmail.com");
    driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("123456789");
    driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
    System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
    driver.findElement(By.cssSelector("button[class*='go-to-login-btn']")).click();
    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
    driver.findElement(By.name("inputPassword")).sendKeys(password);
    Thread.sleep(2000);
    driver.findElement(By.id("chkboxTwo")).click();
    driver.findElement(By.cssSelector("button[type*='submit']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();	
    Assert.assertEquals(driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText(), "You are successfully logged in.");
	
    
    
	}
	
	public static String getpassword(WebDriver driver) {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	String password=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String [] passwordarray=password.split("'");
		String passwordarray1=passwordarray[1].split("'")[0];
		return passwordarray1;
		
		
	}
	
	
}
