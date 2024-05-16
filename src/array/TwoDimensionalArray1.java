package array;

public class TwoDimensionalArray1 {

	public static void main (String[]args) {
		
		//2 - Dimensional Array (Same number of column)
		
		int h[][] = new int[3][3];
		
		h[0][0] = 10;
		h[0][1] = 20;
		h[0][2] = 30;
		h[1][0] = 40;
		h[1][1] = 50;
		h[1][2] = 60;
		h[2][0] = 70;
		h[2][1] = 80;
		h[2][2] = 90;
		
		System.out.println(h.length);
		
		System.out.println(h[1][2]);
		
		System.out.println();
		
		System.out.println("Matrix form" +"\n");
		
		for(int i=0; i<=h.length-1; i++) {
			for(int j=0; j<=h.length-1; j++) {
				System.out.print(h[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}
