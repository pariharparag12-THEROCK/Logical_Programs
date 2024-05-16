package sixteenmarch;

public class StarPatternWithDigit {

	public static void main(String[] args) {
		
		for (char i='A'; i<='E'; i++) {
			
			for (char j='E'; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(char k='A'; k<=i; k++) {
				
				System.out.print(k);
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		

		for (int i=1; i<=5; i++) {
			
			for (int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				
				System.out.print(k);
			}
			
			System.out.println();
		}
		
		
		
		
		System.out.println();
		
		
		
		
		
		
		
		
		for (char i='A'; i<='E'; i++) {
					
					for (char j='E'; j>=i; j--) {
						System.out.print(" ");
					}
					
					for(char k='A'; k<=i; k++) {
						
						System.out.print(k+ " ");
					}
					
					System.out.println();
				}
		
		
		
				
		System.out.println();
		
		
		
		
		
		for (int i=1; i<=5; i++) {
			
			for (int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				
				System.out.print(k+ " ");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		System.out.println();
		
		
		
		
		for (char i='A'; i<='E';  i++) {
			
			for (char j ='A'; j<=i; j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		
		for (int i=1; i<=5;  i++) {
					
					for (int j =1; j<=i; j++) {
						
						System.out.print(j);
					}
					
					System.out.println();
				}
		
		
		
		
	}

}
