package WindowsHandling;


	

import java.util.Set;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Launch {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement txt = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txt.sendKeys("Iphone 6");
		WebElement searchbtn = driver.findElement(By.xpath
				("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		searchbtn.click();
		WebElement iphone = driver.findElement(By.xpath
				("//p[text()='iPhone 6S Soft Silicon Cases O4U - Blue Plain Cover']"));
		iphone.click();
		String par = driver.getWindowHandle();

		Set<String> All = driver.getWindowHandles();
		
		//System.out.println(par);
		//System.out.println(All);
		
		
		
		
		
		
		
		
		
		
}
}