import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {
public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\Driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
TakesScreenshot tk=(TakesScreenshot)driver;
File src=tk.getScreenshotAs(OutputType.FILE);
File desc=new File("C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\A\\SS\\ss.png");
FileUtils.copyFile(src, desc);


}
}
