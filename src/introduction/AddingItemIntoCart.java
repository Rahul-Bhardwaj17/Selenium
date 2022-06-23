package introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemIntoCart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		String[] names= {"Cucumber","Carrot","Beans","Potato"};
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> items=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i = 0;i<items.size();i++) {
			String[] indexitems=items.get(i).getText().split("-");
			String finalveggie=indexitems[0].trim();
			
            List mylist=Arrays.asList(names);
			
			if(mylist.contains(finalveggie)) {
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==mylist.size()) {
					
					break;
				}
				
			}
			
			
		
		}
		
	}

}
