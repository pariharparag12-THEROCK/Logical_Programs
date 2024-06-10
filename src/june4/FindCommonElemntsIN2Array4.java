package june4;

import java.util.Arrays;

public class FindCommonElemntsIN2Array4 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int b[] = {6,7,2,9,1};
		
		System.out.println("Common Elements present in two Array are: ");
		
		Arrays.sort(a);
		
		Arrays.sort(b);
		
		for (int i=0; i<=a.length-1; i++) {
			for(int j=0; j<=b.length-1; j++) {
				
				
				if (a[i]==b[j]) {
					
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
