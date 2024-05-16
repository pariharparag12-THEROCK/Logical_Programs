package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

		@FindBy (xpath = "//div[text()='Tasks']")
		private WebElement tasks;
		
		@FindBy (xpath ="//div[text()='Reports']")
		private WebElement reports;
		
		@FindBy (xpath ="//div[text()='Users']")
		private WebElement users;
		
		@FindBy (xpath ="//a[text()='Logout']")
		private WebElement logout;
		
		public HomePage (WebDriver driver) {	
			PageFactory.initElements(driver, this);
		}
		
		public void clickOnTaskbutton () throws InterruptedException {
			tasks.click();
			Thread.sleep(2000);
		}
		
		public void clickOnReportbutton() throws InterruptedException {
			reports.click();
			Thread.sleep(2000);
		}
		
		public void clickOnUserbutton() {
			users.click();
		}
		
		public void clickOnLogoutbutton() throws InterruptedException {
			logout.click();
			Thread.sleep(2000);
		}
		
		/*public void verifyLogoutButton() {
			boolean r = logout.isEnabled();
			
			SoftAssert sf = new SoftAssert();
			
			sf.assertTrue(r);
		}*/
		
		public boolean verifyLogoutButton() {
		
			return logout.isEnabled();
		
		}
		
		
}
