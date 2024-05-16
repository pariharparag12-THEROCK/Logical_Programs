package Company_Programs;

public class This2 extends This1{

	int a = 40;

	public  void check(){

		System.out.println(a);
		System.out.println(super.a);

	}
	
	public static void main(String[]args) {
		
		This2 orv = new This2();
		
		orv.check();
	}
	
}
