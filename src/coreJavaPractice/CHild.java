package coreJavaPractice;

public class CHild  {

	public void job() {
		
		System.out.println("Sons job");
	}
	
	
	public void bike() {
		System.out.println("Sons bike");
	}
	
	
	public void rock() {
		//Car();
		
		Father orv1 = new Father();
		orv1.Car();
	}
	
	
	
	
	
	public static void main(String[]args) {
		
		CHild orv =new CHild();
		
		
		
		orv.bike();
		orv.job();
		
//		orv.Car();
//		orv.land();
		
		orv.rock();
	}
	
}
