package november8;

import java.util.Arrays;

public class FindCommonElementsIn2Array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int b[] = {6,7,2,9,1,3,4,0,3};
		
		Arrays.sort(a);
		
		Arrays.sort(b);
		
		for (int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for (int j=0; j<=b.length-1; j++) {
			System.out.print(b[j]+" ");
		}
		
		System.out.println();
		System.out.println("The Common Element in two array is : ");
		
		for (int i=0; i<=a.length-1; i++) {
			
			for (int j=0; j<=b.length-1; j++) {
				
				if (a[i]==b[j]) {
					
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
