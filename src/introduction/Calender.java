package introduction;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver 2");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	driver.get("https://www.path2usa.com/travel-companions");
	//11 Aug'22
	driver.findElement(By.id("travel_date")).click();
	
	  
	driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August");
	while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("August")) {
		driver.findElement(By.cssSelector("[class='datepicker-days'] [class='next']")).click();
		
	}

	 List<WebElement> dates = driver.findElements(By.className("day"));
	int count = driver.findElements(By.className("day")).size();
	for(int i=0;i<count;i++) {
		String a = driver.findElements(By.className("day")).get(i).getText();
		if(a.contains("11")) {
			driver.findElements(By.className("day")).get(i).click();
			break;
		}
		
	}
	
	
	
	}
}
