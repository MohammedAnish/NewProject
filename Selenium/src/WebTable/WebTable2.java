package WebTable;




	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class WebTable2 {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List<WebElement> tRows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < tRows.size(); i++) {
			WebElement tRow = tRows.get(i);
			List<WebElement> tDatas = tRow.findElements(By.tagName("td"));
			for (int j = 0; j < tDatas.size(); j++) {
				WebElement tData = tDatas.get(j);
				String text = tData.getText();
				//System.out.println(text);
				if (text.equals("Dubai")) {
					System.out.println(text);
					System.out.println("row number"  +i);
					System.out.println("column number"  +j);
					
				}
				
			}
			
		}
			
		}	
		
		}




