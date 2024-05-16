package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandle {

	static WebDriver driver;

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		System.out.println("User has seen the information on Simple alert popup");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		System.out.println("User has seen the information on Simple alert popup after appearing on 5 sec");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		String element = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println("User clicked on cancel button of confirmation alert popup" + " and also capture the confirmation message i.e. "+ "\n"+ element);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("PARAG");
		Thread.sleep(2000);	
		driver.switchTo().alert().accept();
		System.out.println("User successfully entered the information in prompt alert popup");
		Thread.sleep(3000);	
		
		driver.close();
		
}

}
