package ArmTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.yahoo.com");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.id("login-username")).sendKeys("the_mrsmat");
		
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		
		driver.findElement(By.name("password")).sendKeys("Hyeksus23");
		
		driver.findElement(By.xpath("//*[@id=\'login-signin\']")).click();
		
		driver.findElement(By.xpath("//*[@id=\'root_1\']")).click();
		
		driver.findElement(By.xpath("//*[@id='app']/div[2]/div/div[1]/nav/div/div[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='message-to-field']")).sendKeys("the_mrsmat@yahoo.com");
		
		driver.findElement(By.xpath("//*[@id='mail-app-component']/div/div/div/div[1]/div[3]/div/div/input")).sendKeys("hi");
		
		driver.findElement(By.xpath("//*[@id='editor-container']/div[1]")).sendKeys("Automation test");
		
		driver.findElement(By.xpath("//*[@id='mail-app-component']/div/div/div/div[2]/div[2]/div/button")).click();
		
	
	}
	
}
