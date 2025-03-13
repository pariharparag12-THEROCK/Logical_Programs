package coreJavaPractice;

public class InterfaceClass implements Interface1,Interface2,Interface3{

	//int a =20;
	
	@Override
	public void demo5() {
		System.out.println("This is Demo5");
		
	}

	@Override
	public void demo6() {
		System.out.println("This is Demo6");
		
	}

	@Override
	public void demo4() {
		System.out.println("This is Demo4 "+b);
		
	}

	@Override
	public void demo1() {
		System.out.println("This is Demo1");
		
	}

	@Override
	public void demo2() {
		System.out.println("This is Demo2");
		
	}

	@Override
	public void demo3() {
		System.out.println("This is Demo3");
		
	}
	
	
	public static void main(String[]args) {
		
		InterfaceClass orv = new InterfaceClass();
		
		orv.demo1();
		orv.demo2();
		orv.demo3();
		orv.demo4();
		orv.demo5();
		orv.demo6();
		
		
		Interface2 orv1 = new InterfaceClass();
		
		orv1.demo4();
		
	}
	

}
