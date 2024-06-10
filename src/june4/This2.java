package june4;

public class This2 extends This1 {

	
		
		int a =90;
		
		public void method2() {
			
			
			int a =50;
			
			System.out.println(a); //50
			System.out.println(this.a ); //90
			System.out.println(super.a );//10
			
			System.out.println(super.a - a ); // -40
			
			System.out.println(super.a - this.a );//-80
		}
		
		
		public static void main(String[] args) {
			This2 orv = new This2();
			orv.method2();
	}

}
