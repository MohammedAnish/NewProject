import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Task2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	String Url = driver.getCurrentUrl();
	System.out.println(Url);
	String Ti = driver.getTitle();
	System.out.println(Ti);
	
	
	
	}

}
