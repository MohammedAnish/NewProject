package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.facebook.com");
	String Url = Driver.getCurrentUrl();
	System.out.println("Url");
	String Title = Driver.getTitle();
	System.out.println("Title");
	WebElement txtuser = Driver.findElement(By.id("email"));
	txtuser.sendKeys("anish@gmail.com");
	
}
}
