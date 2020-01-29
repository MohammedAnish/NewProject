import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay4Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
driver.get("http://www.greenstechnologys.com");
	
WebElement create = driver.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
	String txt = create.getText();
	
	System.out.println(txt);
}
}
