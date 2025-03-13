package september1;

public class AscendingOrderWithoutSorting {

	public static void main(String[] args) {
		
		int a[] = {5,4,2,1,3,7};
		
		for (int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		int temp ;
		
		for (int i=0; i<=a.length-1; i++) {
			
			for (int j=i+1; j<=a.length-1; j++) {
				
				if (a[i]<a[j]) {
					
					temp = a[i];
					
					a[i] = a[j];
					
					a[j] = temp;
					
					
					for (int n=0;n<=a.length-1; n++) {
						System.out.print(a[n]+" ");
					}
					
					System.out.println();
					
				}	
				
			}
			

			
		}
		
		
		System.out.println();
		
		for (int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
		

	}
	

	

}
