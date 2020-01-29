package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Launch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement cour = driver.findElement(By.xpath("//a[text()='COURSES']"));
	Actions acc=new Actions(driver);
	acc.moveToElement(cour).perform();
	Thread.sleep(2000);
	WebElement Orac = driver.findElement(By.xpath("//span[text()='Oracle Training ']"));
	acc.moveToElement(Orac).perform();
	Thread.sleep(3000);
	WebElement cli = driver.findElement(By.xpath("//span[text()='Oracle SQL Training']"));
	cli.click();
	
	}

}
