package november8;

public class StarPatternWithDigit {

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
			for(int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
		
		System.out.println();
		
		
		for (char i='A'; i<='D'; i++) {
			for (char j='C'; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(char k='A'; k<=i; k++) {
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
		
		
		for(int i=1; i<=4; i++) {
			
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
		
		
		for (int i=1; i<=4; i++) {
			
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for (char i='A'; i<='E'; i++) {
			
			for(char j='E'; j>=i; j-- ) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for ( char i='E' ; i>='A'; i--) {
			
			for (char j='A'; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}


}
