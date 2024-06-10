package june4;

public class This1 {

	
	
	
	int a =10;
	
	
	public void method1() {
		
		int a  = 40;
		
		System.out.println(a); //40
		
		System.out.println(this.a); // 10
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		This1 orv = new This1();
		
		orv.method1();
	}

}
