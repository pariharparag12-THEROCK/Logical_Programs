package Company_Programs;

public class This1 {

		int a =10;


		public void demo(){

			int a = 20;

			System.out.println(this.a);
		}

		
		
		public static void main (String[]args) {
			
			This1 orv =  new This1();
			
			orv.demo();
		}
}
