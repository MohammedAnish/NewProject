package RightClick;


	

	import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class RightClick {
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		WebElement txt = driver.findElement(By.id("email"));
		txt.sendKeys("ansdk");
		Actions acc=new Actions(driver);
		acc.doubleClick(txt).perform();
		acc.contextClick(txt).perform();
		Robot r=new Robot();
		for (int i = 1; i <=2; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	WebElement pass = driver.findElement(By.id("pass"));
	pass.click();
	Actions acc1=new Actions(driver);
	acc1.doubleClick(pass).perform();
	acc1.contextClick(pass).perform();
	Robot t=new Robot();
	for (int i = 1; i <4; i++) {
		t.keyPress(KeyEvent.VK_DOWN);
		t.keyRelease(KeyEvent.VK_DOWN);
		
	}
	t.keyPress(KeyEvent.VK_ENTER);
	t.keyRelease(KeyEvent.VK_ENTER);
	
		
	}
	
	
	
	
	
}


