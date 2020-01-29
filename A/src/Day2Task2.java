import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\ELCOT\\\\Downloads\\\\eclipse\\\\faf\\\\A\\\\Driver\\\\chromedriver.exe");
	
	WebDriver Driver=new ChromeDriver();
	Driver.get("https://www.redbus.in/");
	String Url = Driver.getCurrentUrl();
	System.out.println(Url);
	String Ti = Driver.getTitle();
	System.out.println(Ti);
	
	WebElement TxtFr = Driver.findElement(By.id("src"));
	TxtFr.sendKeys("AMBUR");
	
	
	WebElement TxtTo = Driver.findElement(By.id("dest"));
	TxtTo.sendKeys("CHENNAI");
}
}
