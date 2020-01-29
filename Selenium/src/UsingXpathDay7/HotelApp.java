package UsingXpathDay7;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class HotelApp {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.adactin.com/HotelApp/");
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("anish");
		WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
		txtPass.sendKeys("123456");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		}

	}



