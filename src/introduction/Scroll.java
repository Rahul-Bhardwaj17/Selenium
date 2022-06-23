package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,500)");
		je.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		List<WebElement> a = driver.findElements(By.xpath("//td[4]"));
		for (int i=0; i<a.size();i++) {
			
			System.out.println(driver.findElements(By.xpath("//td[4]")).get(i).getText());
			
		}
	}
}
