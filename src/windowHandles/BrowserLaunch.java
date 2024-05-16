package windowHandles;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch implements CommonProperties{


	static WebDriver driver;
	public void chromeLaunch() throws InterruptedException {
		
		System.setProperty(key, value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		
		String p = driver.getWindowHandle();
		System.out.println("Parant Window ID is "+p);
		
//		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='New Message Window']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
//		Thread.sleep(3000);
		
		Set<String> pc = driver.getWindowHandles();
		int count = pc.size();
		System.out.println("Total window on screen is "+count);
		
		System.out.println("All Id's on Screen are "+ pc);
		Thread.sleep(3000);
		
//	driver.switchTo().window(p);
//		Thread.sleep(3000);
		
		for(String c : pc) {
			
			if(!p.equalsIgnoreCase(c)) {
				driver.switchTo().window(c);
				System.out.println("Child Window Tittle is " +driver.getTitle());
				//Thread.sleep(2000);
				driver.close();
			}
		}
		
		driver.switchTo().window(p);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@aria-current='page'])[1]")).click();
		System.out.println("Home Tittle is " + driver.getTitle());
		
		
	}

}
