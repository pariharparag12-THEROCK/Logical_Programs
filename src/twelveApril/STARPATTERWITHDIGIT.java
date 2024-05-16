package twelveApril;

public class STARPATTERWITHDIGIT {

	public static void main(String[] args) {


		for (int i=1; i<=5; i++) {
			
			for (int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		
		for (char i='A'; i<='E'; i++) {
					
					for (char j='A'; j<=i; j++) {
						
						System.out.print(j);
					}
					
					System.out.println();
				}
				
				
				System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i=1; i<=4; i++) {
			
			for (int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		

		for (char i='A'; i<='D'; i++) {
			
			for (char j='C'; j>=i; j--) {
				System.out.print(" ");
			}
			
			for (char k='A'; k<=i; k++) {
				System.out.print(k);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
		
		
		for (int i=1; i<=4; i++) {
			
			for (int j=3; j>=i; j--) {
				
				System.out.print(" ");
			}
			
			for (int k=1; k<=i; k++) {
				System.out.print("*"+" ");
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		for (char i='A'; i<='D'; i++) {
			
			for (char j='C'; j>=i; j--) {
				
				System.out.print(" ");
			}
			
			for (char k='A'; k<=i; k++) {
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		
		
		
		
		for (int i=1; i<=4; i++) {
			
			for (int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
			for(int l=2; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		for (char i='A'; i<='D'; i++) {
			
			for (char j='C'; j>=i; j--) {
				System.out.print(" ");
			}
			
			for (char k='A'; k<=i; k++) {
				System.out.print(k);
			}
			
			for(char l='B'; l<=i; l++) {
				System.out.print(l);
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		for (int i=1; i<=5; i++) {
			
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		System.out.println();
		
		
		
			for (char i='A'; i<='E'; i++) {
					
					for(char j='E'; j>=i; j--) {
						System.out.print(j);
					}
					
					System.out.println();
				}
		
		
			System.out.println();
			
			

		for (char j='E'; j>='A'; j--) {
			
			for(char i='A'; i<=j; i++) {
				System.out.print(i);
			}
			
			System.out.println();
		}

	}

}
