package new_Programs;

public class AscDscORDERWithoutUsingSorting {
				
	
	public static void main(String[] args) {
     
		
		int a[ ] = {5,4,2,1,3,7};
		
		int temp=0;
		
	
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
		
		
		for (int i=0; i<=a.length-1; i++) {
		
			System.out.print(a[i]+" ");
		}
	
		System.out.println();  
		
		
	/*	
	 * System.out.println("The Array in Descending Order");  
	 * 
	 * for (int i=0; i<=a.length-1; i++) {
			
			for (int j=i+1; j<=a.length-1; j++) {
				
				if (a[i]<a[j]) {
					
					temp = a[i]; //2
					
					a[i] = a[j];  //1
					
					a[j] = temp; //2    
				
					
									
				}					
			}						
									
									
		}							
									
		
		
		System.out.println();
		
		
		for (int i=0; i<=a.length-1; i++) {
		
			System.out.print(a[i]+" ");
		}*/
		
	}
}
