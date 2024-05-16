package practice;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import exceptions.exception_sequence_Program;

public class prac {

	static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//p[contains(@class,'oxd-userdropdown-name')]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//a[@role='menuitem']"));
		
		
		for(WebElement element : list) {
			if(element.getText().contentEquals("Change Password")) {
			element.click();
			

			WebElement companyNameValue1 = driver.findElement(By.xpath("//p[text()='OrangeHRM']"));
			
			String companyNameValue11 = companyNameValue1.getText();
			
			if (companyNameValue11.equals("OrangeHRM")) {
				System.out.println("Testcase Passed");
			}
			else {
				System.out.println("Testcase Failed");
			}
			
			
			break;
			}
		}
		
		
		
		
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		//boolean res = companyName.isDisplayed();
		
		
		
		driver.close();
		
		
	
	}
	
	
		
		
}
