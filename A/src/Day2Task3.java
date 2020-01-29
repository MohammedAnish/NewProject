import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Task3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
driver.get("https://www.google.com");
String Url = driver.getCurrentUrl();
System.out.println(Url);
String Ti = driver.getTitle();
System.out.println(Ti);

WebElement Txt = driver.findElement(By.xpath("//input[@jsaction='paste:puy29d']"));
Txt.sendKeys("Enter GreensTechnology.");

}
}


