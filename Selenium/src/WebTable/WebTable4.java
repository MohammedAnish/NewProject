package WebTable;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WebTable4 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRows.size(); i++) {
			if (i%2==1) {
				WebElement tRow = tRows.get(i);
				String text = tRow.getText();
				System.out.println(text);
			}
		}
					
				
	
			
		
			
		}	
		
		}







