import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1Task4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\geckodriver.exe");

	WebDriver driver=new FirefoxDriver();

	driver.get("http://www.flipkart.com/");
	String Url = driver.getCurrentUrl();
	System.out.println(Url);
	String Ti = driver.getTitle();
	System.out.println(Ti);
	
	}
}
