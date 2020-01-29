package UsingXpathDay7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));
		txtUser.sendKeys("anish@gmail.com");
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPass.sendKeys("123456");
		//WebElement btnClick = driver.findElement(By.xpath("//input[@type='submit']"));
		//btnClick.click();
		WebElement btnFemale = driver.findElement(By.xpath("//input[@value='1']"));
		btnFemale.click();
	
		
	}

}
