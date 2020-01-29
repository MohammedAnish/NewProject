package Day3Task;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GreensTech {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("http://www.greenstechnologys.com/");
		WebElement cont = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		cont.click();
		WebElement name = driver.findElement(By.xpath("//input[@name='name'][1]"));
		name.sendKeys("anish");
		WebElement clic = driver.findElement(By.xpath("//button[@id='submit']"));
		clic.click();
		

		}
}
