package Day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Durations;

public class waitsss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver(options);
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().window().maximize();
//Thread.sleep(5000);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

	}

}
