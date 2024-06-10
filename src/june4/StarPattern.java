package june4;

public class StarPattern {

	public static void main(String[] args) {
		

		for (char i='A'; i<='D'; i++) {
			
			for (char j='D'; j>=i; j--) {
				System.out.print(" ");
			}
			
			for (char k='A'; k<=i; k++) {
				System.out.print(k);
			}
			
			for (char l ='B'; l<=i; l++) {
				System.out.print(l);
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		for (char i='E'; i>='A'; i--) {
			
			for (char j='A'; j<=i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		
		
	}

}
