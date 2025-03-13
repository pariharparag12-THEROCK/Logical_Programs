package coreJavaPractice;

public class AbstractionMain {
	
	
	public static void m1() {
		
		
	}
	
	static public void m2() {

		System.out.println("Parag");
		
	}
	

	public static void main(String[]args) {
		
		SBI orv1 = new SBI();
		
		orv1.welocome();
		orv1.Check();
		orv1.accountName();
		orv1.name();
		
		System.out.println();
		
		HDFC orv2 = new HDFC();
		
		orv2.welocome();
		orv2.Check();
		orv2.accountName();
		orv2.name();
		
		AbstractionMain orv3 = new AbstractionMain();
		
		orv3.m2();
	}
}
