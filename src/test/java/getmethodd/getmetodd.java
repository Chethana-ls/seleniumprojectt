package getmethodd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v108.runtime.model.WebDriverValue;

public class getmetodd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
WebDriver driver =new ChromeDriver(options);

driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

System.out.println("current URL:"+driver.getCurrentUrl());
System.out.println("title of the page:"+driver.getTitle());
Thread.sleep(5000);
driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9110290805");
driver.findElement(By.xpath("//input[@id='continue']")).click();
driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Chethan@3012");
driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
//driver.switchTo().frame("Sign in with Google");
//driver.findElement(By.xpath("//[@title='Sign in with Google Button']")).click();
//driver.findElement(By.xpath("//iframe[input[@type='email']]")).sendKeys("chethana@algoshack.com");
//driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[2]'")).click();
	}
;
}
