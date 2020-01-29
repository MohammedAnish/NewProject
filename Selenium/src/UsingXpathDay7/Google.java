package UsingXpathDay7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement txtEnter = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		txtEnter.sendKeys("GreensTechnology");
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		



}
}
