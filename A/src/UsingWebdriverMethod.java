import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWebdriverMethod {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("toolsqa.com/automation-practise-table/");

		driver.findElement(By.tagName(tagName))
		
	}
}
