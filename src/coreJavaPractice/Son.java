package coreJavaPractice;

public class Son extends Parent{
	
	public static void m1() {
		System.out.println("MMMMMM");
	}
	
	
	
	public static void main(String[] args) {
		
		//Parent v = new Son();
		
		//v.m1();//Method Hiding
		
		Son v1 = new Son();
		
		v1.m1();
		
	}
}
