package september1;

import java.util.Arrays;

public class FindACommonElementInTWOARRAY {

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};
		
		int b[] = {6,7,2,9,1,3,4,6,0};
		
				
		Arrays.sort(a);
		
		Arrays.sort(b);
		
		
		for (int i=0; i<=a.length-1; i++) {
			
			for (int j=0; j<=b.length-1; j++) {
				
				if (a[i]==b[j]) {
					
					System.out.print(b[j]+" ");
				}
			}
			
		}
		
		
		
	}

}
