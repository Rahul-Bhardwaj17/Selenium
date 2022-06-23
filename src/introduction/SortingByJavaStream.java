package introduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SortingByJavaStream {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver 2");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//span[@class='sort-icon sort-descending']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		List<String> originalList=list.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertEquals(originalList, sortedList);
		
		
	
		
		
	}

}
