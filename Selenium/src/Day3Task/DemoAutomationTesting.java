package Day3Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DemoAutomationTesting {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	name.sendKeys("anish");
	WebElement last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	last.sendKeys("raqeeb");
	WebElement add = driver.findElement(By.xpath("//textarea[@rows='3']"));
	add.sendKeys("Chennai");
	WebElement add2 = driver.findElement(By.xpath("//textarea[@rows='3']"));
	
	add2.sendKeys("Tamilnadu");
	WebElement btn = driver.findElement(By.xpath("//input[@type='radio'][1]"));
	btn.click();
	WebElement game = driver.findElement(By.id("checkbox1"));
	game.click();

	WebElement mon = driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
	
	Select s=new Select(mon);
	s.selectByValue("July");
	WebElement year = driver.findElement(By.xpath("//select[@ng-model='yearbox']"));
	Select y=new Select(year);
	y.selectByValue("1994");
	
	}
}


