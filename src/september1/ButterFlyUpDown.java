package september1;

public class ButterFlyUpDown {

	public static void main(String[] args) {
		
		for (int i=1; i<=4; i++) {
			
			for (int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			
			for (int k=4; k>=i; k--) {
				System.out.print("*");
			}
			
			for (int l=3; l>=i; l-- ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i=2; i<=4; i++) {
			
			for (int j=3; j>=i; j--) {
				System.out.print(" ");
			}
			
			for (int k=2; k<=i; k++) {
				System.out.print("*");
			}
			
			for (int l=1; l<=i; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	
	}

}
