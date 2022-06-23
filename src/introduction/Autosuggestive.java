package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ger");
		Thread.sleep(3000);
		List<WebElement>options=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for (WebElement option:options) {
			if(option.getText().equalsIgnoreCase("germany")) {
				option.click();
				break;
				
			}
			
			
		}
		
}
}
