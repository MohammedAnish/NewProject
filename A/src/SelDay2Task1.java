import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDay2Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	String Url = driver.getCurrentUrl();
	System.out.println(Url);
	
	String Ti = driver.getTitle();
	System.out.println(Ti);
	
	WebElement Txtusr = driver.findElement(By.id("email"));
	Txtusr.sendKeys("anish.51@gmail.com");
	
	WebElement Txtpass = driver.findElement(By.name("pass"));
	Txtpass.sendKeys("123456789");
	
	WebElement Txtlogin = driver.findElement(By.xpath("//input[@data-testid='royal_login_button']"));
	Txtlogin.click();
	}
	
	
	

}
