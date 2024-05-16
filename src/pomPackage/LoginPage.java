package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver driver;
	
	private WebDriverWait wait;
	
	@FindBy (xpath = "//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath ="//input[@name='pwd']")
	private WebElement password;
	
	@FindBy (xpath ="//div[text()='Login ']")
	private WebElement login;
	
	
	public LoginPage (WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}
	
	public void sendUsername () throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("admin");
		//System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
	}
	
	public void sendPassword() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("manager");
		Thread.sleep(2000);
	}
	
	public void clickOnLogin() throws InterruptedException {
		login.click();
		Thread.sleep(2000);
	}
	
	//OR
	
//	public void loginActiTime() {
//		username.sendKeys("admin");
//		password.sendKeys("manager");
//		login.click();
//	}
//	
}
