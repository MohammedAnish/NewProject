package org.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("www.facebook.com");
		String Url = driver.getCurrentUrl();
	System.out.println("Url");	
	String Title = driver.getTitle();
	System.out.println("Ti");
	}
	

}
