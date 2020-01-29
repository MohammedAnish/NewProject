import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay4Task2 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		
		
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
		
		String Ti = driver.getTitle();
		System.out.println(Ti);
		
		WebElement Create = driver.findElement(By.xpath("//p[contains(text(),'Greens Technology, Rated As ')]"));
		String Txt = Create.getText();
		System.out.println(Txt);
		
		}
}
