package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("http://www.facebook.com");
	WebElement mon = driver.findElement(By.id("month"));
	Select s=new Select(mon);
	s.selectByValue("5");

}
}