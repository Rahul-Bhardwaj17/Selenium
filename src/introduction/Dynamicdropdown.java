package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@text='Delhi (DEL)']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//a[@text='Udaipur (UDR)'])[2]")).click();
	    System.out.println(driver.findElement(By.xpath("(//a[@text='Udaipur (UDR)'])[2]")).getText());
	}
}
