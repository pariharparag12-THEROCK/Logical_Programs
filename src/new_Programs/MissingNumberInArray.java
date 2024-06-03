package new_Programs;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[]args) {
		
		int[] a = {4,5,6,7,9};
		
		
		
		for(int i=0; i<=a.length-1; i++) {
				
			System.out.print(a[i]+" ");
			
		}
		
		System.out.println();
		
		
		Arrays.sort(a);
		
		
		int first = a[0];
		
		System.out.println(first);
		
		for(int i=1; i<=a.length-1; i++) {
			
			if (a[i]==first +1) {
				
				System.out.println(a[i]+" ");
				
				first = a[i];
			}
			
			else {
				
				System.out.println("Missing value in array is : "+(first +1));
				
				break;
			}
			
			
		}
		
		
	}
}
