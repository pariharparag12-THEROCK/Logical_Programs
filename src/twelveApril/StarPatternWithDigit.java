package twelveApril;

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
		
		
		for (char i='A'; i<='E';  i++) {
			
			for (char j ='A'; j<=i; j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
		
		
		
	}

}
