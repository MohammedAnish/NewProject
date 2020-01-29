package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com");
		WebElement txt = Driver.findElement(By.id("reg_pages_msg"));
		String txt1 = txt.getText();
		System.out.println(txt1);
	}
	}



