package DemoBlaze.DemoBlaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddCart2Product {
	WebDriver driver;


	@Test
	public void a_start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("login2")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("loginusername")).sendKeys("abdc@gmail.com");
		driver.findElement(By.id("loginpassword")).sendKeys("1230");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Test
	public void b_cart() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Monitors']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement check = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='ASUS Full HD']")));
		check.click();
	String a = driver.findElement(By.xpath("//strong[contains(text(),'Product')]")).getText();
	String b = driver.findElement(By.xpath("//p[contains(text(),'HD')]")).getText();
System.out.println(a);
System.out.println(b);
	}

	

	@Test
	public void d_quit() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.quit();
	}
}
