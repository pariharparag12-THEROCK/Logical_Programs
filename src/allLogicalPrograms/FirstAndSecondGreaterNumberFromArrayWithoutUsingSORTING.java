package allLogicalPrograms;

import java.util.Arrays;

public class FirstAndSecondGreaterNumberFromArrayWithoutUsingSORTING {

	
	
	public static void main(String[]args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		int g1 = 0;
		
		int g2 = 0;
		
		for (int i=0 ; i<=a.length-1; i++) {
			
			if (a[i]>g1) {
				
				g2=	g1;    // 0, 1, 2.....
				
				g1= a[i]; // 1, 2, 3....
			}
			
		}
		
		
		System.out.println("First greater number from the array is: "+g1);
		
		System.out.println("Second greater number from the array is: "+g2); 
		

	/*	Arrays.sort(a);

		System.out.println("First greater number from the array is: "+ a[a.length-1] );
		System.out.println("Second greater number from the array is: "+ a[a.length-2] );
		
		*/
		
		
		
		
		
		 
		 //Another method
		/*  int temp=0;
		
	
		for (int i=0; i<=a.length-1; i++) {
			
			for (int j=i+1; j<=a.length-1; j++) {
				
				if (a[i]>a[j]) {
					
								// if a[i]>a[j] swap a[i] and a[j]
					
					temp = a[i]; 
					
					a[i] = a[j];  
					
					a[j] = temp;   
				
					
									//[4,5,2,1,3,7]	.....	 first Iloop starts
				}					//[2,5,4,1,3,7]
			}						//[1,5,4,2,3,7]
									//[1,4,5,2,3,7].........second I loop starts
									//[1,2,5,4,3,7]
									//[1,2,4,5,3,7].........Third I loop starts
		}							//[1,2,3,5,4,7]
									//[1,2,3,4,5,7]............Fourth I loop starts
									//[1,2,3,4,5,7]
		
		
		System.out.println();
		
		
		for (int i=a.length-1; i<=a.length-1; i++) {
		
			System.out.println("The First greater number in array :"+a[i]);
		}
		
		
		for (int j=a.length-2; j<=a.length-2; j++) {
		
			System.out.println("The Second greater number in array :"+a[j]);
		}
	
		 
		
		
		
		
		*/
		
		
		
		
		
	}
	
	
	
	
		
}		
