package allLogicalPrograms;

import java.util.Arrays;

import java.util.LinkedHashSet;


public class FindCommonElementsIn2Arrays {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int b[] = {6,7,2,9,1,3,4,0,3};
		
		Arrays.sort(a);
		
		Arrays.sort(b);
		
		System.out.println("Common Elements present in two Array are: ");
		
		
		for(int i=0; i<=a.length-1; i++) {
			
			for (int j=0; j<=b.length-1; j++) {
				
				if (a[i]==b[j] ) {  //&& b[j]!=temp) {
					
					//temp = b[j];
					
					System.out.print(b[j] + " ");
					
					//lhs.add(b[j]);
					
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Common Elements present in two Array Using Hashset are: ");
		
		LinkedHashSet lhs = new LinkedHashSet();
		
		for(int i=0; i<=a.length-1; i++) {
			
			for (int j=0; j<=b.length-1; j++) {
				
				if (a[i]==b[j] ) { 
					
					
					System.out.print(b[j] + " ");
					
					lhs.add(b[j]);
					
				}
			}
		}
		
		System.out.println();
		System.out.println(lhs);
		
		System.out.println("Common Elements present in two Array Using Logic are: ");
		
		int temp =0;
		
		for(int i=0; i<=a.length-1; i++) {
			
			for (int j=0; j<=b.length-1; j++) {
				
				if (a[i]==b[j] && b[j]!=temp ) { 
					
					temp = b[j];
					
					System.out.print(b[j] + " ");
	
					
				}
			}
		}
		

	}

}
