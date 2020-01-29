package UsingXpathDay7;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Insta {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.instagram.com/accounts/login/?hl=en)%20login%20page");
			WebElement txtEnter = driver.findElement(By.xpath("//input[@name='username']"));
			txtEnter.sendKeys("anish");
			WebElement txtPass = driver.findElement(By.xpath("//input[@type='password']"));
			txtPass.sendKeys("123456");
			WebElement btnClick = driver.findElement(By.xpath("//button[@class='sqdOP  L3NKy   y3zKF     ']"));
			
					btnClick.click();
			
			String Url = driver.getCurrentUrl();
			System.out.println(Url);



	}
	}

