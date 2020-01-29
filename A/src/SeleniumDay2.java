import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	WebElement txtuser = driver.findElement(By.xpath("(//input[@class='inputtext login_form_input_box'])[1]"));
	txtuser.sendKeys("anish@yahoo.com");
	
	}
	
	
}
