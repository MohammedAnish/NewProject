package Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	WebElement sim = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	sim.click();
	Alert a = driver.switchTo().alert();
	a.accept();
	
	
	
	
	
	}
	
}
