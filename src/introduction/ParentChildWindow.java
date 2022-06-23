package introduction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildWindow {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a[class*='blinkingText']")).click();
		Set<String>windows=driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent=it.next();
        String child=it.next();
        driver.switchTo().window(child);
        String[] text=driver.findElement(By.xpath("//div[@class='col-md-6 text-left']/h2")).getText().split("to")[1].trim().split("in", 1);
        driver.switchTo().window(parent);
        driver.findElement(By.id("username")).sendKeys(text);
        
	}

}
