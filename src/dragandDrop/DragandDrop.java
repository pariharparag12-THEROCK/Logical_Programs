package dragandDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	
	static WebDriver driver;

	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\AUTOMATION\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		Actions a = new Actions(driver);
		
		WebElement element1 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement element2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		a.dragAndDrop(element1, element2).perform();
		System.out.println("Drag and Drop successfully");
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		WebElement element3 = driver.findElement(By.xpath("//form[@role='search']"));
		a.sendKeys(element3, "wyqiuryiuw").perform();
		System.out.println("Send information typed successfully");
		Thread.sleep(3000);
		
		
		WebElement element4 = driver.findElement(By.xpath("//a[text()='Themes']"));
		a.contextClick(element4).perform();
		System.out.println("right clicked on themes successfully");
		Thread.sleep(3000);
		
		WebElement element5 = driver.findElement(By.xpath("//a[text()='About']"));
		a.doubleClick(element5).perform();
		System.out.println("Double clicked on About Successfully");
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		WebElement element6 = driver.findElement(By.xpath("//a[text()='Demos']"));
		a.click(element6).perform();
		System.out.println("single clicked on About Successfully");
		Thread.sleep(3000);
		driver.close();
		
	}
	
}
