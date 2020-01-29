package DragAndDrop;


	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Launch {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Downloads\\eclipse\\faf\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.id("credit2"));
		WebElement des = driver.findElement(By.id("bank"));
		Actions acc=new Actions(driver);
		acc.dragAndDrop(src, des).perform();
		WebElement src1 = driver.findElement(By.id("credit1"));
		WebElement des1 = driver.findElement(By.xpath("(//ol[@align='center'])[3]"));
		Actions acc1=new Actions(driver);
		acc1.dragAndDrop(src1, des1).perform();
}
}