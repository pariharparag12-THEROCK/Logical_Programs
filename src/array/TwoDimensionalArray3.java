package array;

public class TwoDimensionalArray3 {

	public static void main (String[]args) {
		
		int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
		
		System.out.println(a[1][2]);
		
		System.out.println();
		
		System.out.println("Matrix form");
		
		for(int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=a.length-1; j++) {
				System.out.print(  " " + a[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
