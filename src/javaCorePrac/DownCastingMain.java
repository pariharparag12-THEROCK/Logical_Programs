package javaCorePrac;

public class DownCastingMain {

	public static void main(String[]String) {
		
		Parant p = new Child();
		
		Child c = (Child)p;
		
		c.bike();
		c.job();
		
		c.check(); // overide nonstatic method
		
		c.land();
		c.car();
		c.property();
		
		
		c.demo(); // Childs demo
		
		p.demo();
		
	}
}
