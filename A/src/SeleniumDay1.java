import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDay1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");

WebElement txtuser = driver.findElement(By.id("email"));
txtuser.sendKeys("anish@gmail.com");

WebElement txtpass = driver.findElement(By.id("pass"));
txtpass.sendKeys("123456789");
}


}
