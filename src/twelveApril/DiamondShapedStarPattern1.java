package twelveApril;

public class DiamondShapedStarPattern1 {

	
	public static void main(String[]argStrings) {
		
		for(int i=1; i<=4; i++) {
			
			for (int j=3; j>=i; j--) {		
				System.out.print(" ");
			}
			
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
			for (int l=2; l<=i; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for (int i=1; i<=3; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			
			for (int k=3; k>=i; k--) {
				System.out.print("*");
			}
		
			for(int l=2; l>=i; l--) {
				System.out.print("*");
			}
			
			
			System.out.println();
		}
	}
}
