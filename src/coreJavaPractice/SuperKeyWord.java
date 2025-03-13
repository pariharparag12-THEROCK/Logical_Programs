package coreJavaPractice;

public class SuperKeyWord extends ThisKeyWord{

	int a =90;
	int b=100;
	
	public void minus() {
		
		System.out.println(a-b);
		
		System.out.println(super.a-super.b);
	}
	
	public static void main(String[]args) {
		
		SuperKeyWord orv = new SuperKeyWord();
		
		orv.minus();
	}
}
