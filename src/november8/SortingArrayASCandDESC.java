package november8;

import java.util.Arrays;

public class SortingArrayASCandDESC {

	public static void main(String[] args) {
		
		int a[] = {5,4,1,2,3};
		
		Arrays.sort(a);

		
		for (int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]);
		}
		
		System.out.println();
		
		for (int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]);
		}
		
	}

}
