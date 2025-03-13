package javaCorePrac;

public class SuperKeyWord extends ThisKeyWord{

	int a = 90;
	int b = 100;
	
	public void demo1() {
		
		System.out.println(a-b);
		
		System.out.println(super.a-super.b);
	}
	
	
	public static void main(String[] args) {
		
		SuperKeyWord orv1 = new SuperKeyWord();
		
		orv1.demo1();
		
	}
}
