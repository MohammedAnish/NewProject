package Debug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debug {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.facebook.com");
	WebElement txtUser = driver.findElement(By.xpath("//input[@name='email']"));
	txtUser.sendKeys("anish");
	WebElement txtPass = driver.findElement(By.id("pass"));
	txtPass.sendKeys("123456");
	}

}
