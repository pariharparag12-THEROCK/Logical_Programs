package sizePostion;

public class Main_Exceution_Class extends BrowserLaunch {

	
	public static void main(String []args) throws InterruptedException {
		
		BrowserLaunch orv = new BrowserLaunch();
		orv.chromeLaunch();
		Thread.sleep(3000);
		driver.quit();
		
	}
}
