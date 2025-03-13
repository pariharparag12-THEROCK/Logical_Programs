package javaCorePrac;

public class UpCastingMain {

	public static void main(String[]args) {
		
		Parant p = new Child();
		
		p.car();
		p.land();
		p.property();
		
		p.check();// override non static method
		
//		Parant.demo();
//		Child.demo();
		
		p.demo(); // parants demo
	}
}
