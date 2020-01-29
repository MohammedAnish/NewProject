package UsingXpathDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement txtFrom = driver.findElement(By.xpath("//input[@type='text'][1]"));
		txtFrom.sendKeys("AMBUR");
		WebElement txtTo = driver.findElement(By.xpath("//input[@tabindex='2']"));
		txtTo.sendKeys("Egmore");
	}

}
