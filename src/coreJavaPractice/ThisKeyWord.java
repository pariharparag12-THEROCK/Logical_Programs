package coreJavaPractice;

public class ThisKeyWord {

	int a =10;
	int b=30;
	
	public void demo() {
		
		int a =40;
		int b=50;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	public static void main(String[] args) {
		
		ThisKeyWord orv = new ThisKeyWord();
		
		orv.demo();
		

	}

}
