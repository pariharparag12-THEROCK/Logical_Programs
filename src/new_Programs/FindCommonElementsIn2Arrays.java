package new_Programs;

import java.util.Arrays;

public class FindCommonElementsIn2Arrays {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int b[] = {6,7,2,9,1};
		
		Arrays.sort(a);
		
		Arrays.sort(b);
		
		System.out.println("Common Elements present in two Array are: ");
		
		for(int i=0; i<=a.length-1; i++) {
			
			for (int j=0; j<=b.length-1; j++) {
				
				if (a[i]==b[j]) {
					
					System.out.print(a[i] + " ");
				}
			}
		}

	}

}
