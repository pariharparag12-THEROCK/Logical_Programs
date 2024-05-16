package fiveFEBURARY;

public class Fibonnaci {

	
			public static void main(String []args) {
				
				/*int a = 0;
				int b = 1;
				int c;
					
					for (int i=1; i<=10; i++) {
						
						
						
						c = a+b; //3
						
						System.out.print(c + " ");
						
						a = b;
						b = c;
						
					}
					*/
					System.out.println();
					
				int c = 89;
				int b = 55;
				int a;
			
				System.out.print(c+" "+ b+" ");
				
				for (int i=1; i<=8; i++) {
					
					a = c-b;
					
					System.out.print(a + " ");
					
					c = b;
					b = a;
				
				
				}
				
			}
}
