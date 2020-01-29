package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
TakesScreenshot tk=(TakesScreenshot)driver;
File src = tk.getScreenshotAs(OutputType.FILE);
System.out.println(src);
File desc=new File("C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\ScrrenShot\\first.png");
	
FileUtils.copyFile(src, desc);
	}

}
