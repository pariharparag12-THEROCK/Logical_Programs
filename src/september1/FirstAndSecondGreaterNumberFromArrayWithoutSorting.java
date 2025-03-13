package september1;

public class FirstAndSecondGreaterNumberFromArrayWithoutSorting {

	public static void main(String[] args) {
	
		int[] a = {1,5,6,7,8,9,2,3,4};
		
		int temp;
		
		for (int i =0; i<=a.length-1; i++) {
			
			for (int j=i+1; j<=a.length-1; j++) {
				
				
				if (a[i]>a[j]) {
					
					temp = a[i];
					
					a[i] = a[j];
					
					a[j] = temp;
					
				}
				
			}
		}
		
		
		
		for (int i=0; i<=a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
		
		
		for(int i=a.length-1; i<=a.length-1; i++) {
			System.out.println("First greater number is "+ a[i]);
		}
		
		for(int i=a.length-2; i<=a.length-2; i++) {
			System.out.println("Second greater number is "+ a[i]);
		}


	}

}
