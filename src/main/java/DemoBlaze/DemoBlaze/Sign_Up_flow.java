package DemoBlaze.DemoBlaze;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sign_Up_flow {
	WebDriver driver;

	@Test
	public void a_start() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("signin2")).click();
	}

	@Test
	public void b_registeration() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.id("sign-username")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("sign-password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	}

	@Test
	public void c_quit() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
