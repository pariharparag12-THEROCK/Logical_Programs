package windowHandles;

public class Main_Execution_Class extends BrowserLaunch {
	
	public static void main(String[]args) throws InterruptedException {
		
		BrowserLaunch orv = new BrowserLaunch();
		orv.chromeLaunch();
		Thread.sleep(3000);
		driver.quit();
		
	}

	
}
