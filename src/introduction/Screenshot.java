package introduction;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/luv/Desktop/Rahul/Automation/chromedrivers/chromedriver 2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/luv/Desktop/Rahul/Automation/untitled folder/screenshot.png"));
		
		
	}

}
