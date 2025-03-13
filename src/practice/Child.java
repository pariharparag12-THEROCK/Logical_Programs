package practice;

public class Child extends Parent{

	public static void M1() {
		System.out.println("nnnn");
	}
	
	public static void main(String[]args) {
		
		Parent p = new Child();
		Child c = (Child)p;
		
		c.M1();
	}
}
