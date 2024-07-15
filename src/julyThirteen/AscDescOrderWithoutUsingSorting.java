package julyThirteen;

public class AscDescOrderWithoutUsingSorting {

	public static void main(String[] args) {
		
		int a[] = {5, 8, 3, 7, 4};
		
		int temp = 0;
		
		for (int i=0; i<=a.length-1; i++) {
			
			for (int j=i+1; j<=a.length-1; j++) {
				
				if (a[i]> a[j]) {
					
					temp = a[i]; //5
					 
					a[i] = a[j]; //8
					
					a[j] = temp; //5			
					
				}
			}
		}
		
		
		for (int i=0; i<=a.length-1; i++) {
			
			System.out.print(a[i]+ " ");
		}

	}

}
