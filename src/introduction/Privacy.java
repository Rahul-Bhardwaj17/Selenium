package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Privacy {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver 2");
	ChromeOptions options=new ChromeOptions();
	options.setAcceptInsecureCerts(true);
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://expired.badssl.com/");
	System.out.println(driver.getTitle());
	driver.manage().deleteAllCookies();
	
	
	
	}
}
