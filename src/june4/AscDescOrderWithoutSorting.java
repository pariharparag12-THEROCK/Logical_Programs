package june4;

public class AscDescOrderWithoutSorting {

	public static void main(String[] args) {
		
		int a[ ] = {5,4,2,1,3,7};
		
		
		int temp = a[0];
		
	
		
		
		for (int i=0; i<=a.length-1; i++) {
						
			for (int j=i+1; j<=a.length-1; j++) {
				
				
				if (a[i]<a[j]) {  //swap a[i] and a[j]
					
					
						temp	=	a[i];
						
						a[i]  =    a[j];
						
						a[j] =    temp;
					
				}	
				
			}
			
		}
		
		System.out.println();
		
		
		for (int i=0; i<=a.length-1; i++) {
			
			System.out.print(a[i]+" ");
		}
		
		
		

	}

}
