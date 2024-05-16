package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorPractice {

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("pariharparag@gmail.com");
		System.out.println("Username entered successfully");
		
		driver.findElement(By.name("pass")).sendKeys("987654FGH");
		System.out.println("password entered successfully");
		
		driver.findElement(By.tagName("button")).click();
		System.out.println("Login button clicked successfully");
		
		Thread.sleep(5000);
		driver.close();
	}
}
