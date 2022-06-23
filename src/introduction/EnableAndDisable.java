package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableAndDisable {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			
			System.out.println("its disabled");
			
	
		}
		else {
			System.out.println("its enabled");
		}
		
	}
}
