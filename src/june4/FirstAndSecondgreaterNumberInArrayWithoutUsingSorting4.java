package june4;

public class FirstAndSecondgreaterNumberInArrayWithoutUsingSorting4 {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
	/*	int temp = a[0];
		
		for (int i=0; i<=a.length-1; i++) {
			
			for (int j=i+1; j<=a.length-1; j++) {
				
				if (a[i]>a[j]) {
					
					temp =a[i];
					
					a[i]=a[j];
					
					a[j]= temp;
					
				}
			}
			
			
		}
		
		
		for (int i=0; i<=a.length-1; i++) {
			
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("The first greater number is : "+ a[a.length-1]);
		System.out.println("The second greater number is : "+ a[a.length-2]);*/
		
		
		
		int g1=0;
		
		int g2=0;
		
		for (int i=0; i<=a.length-1; i++) {
			
			if (a[i]>g1) {
				
				g2=g1;
				
				g1=a[i];
				
			}
			
			
		}
		
		System.out.println(g1);
		System.out.println(g2);
		
		
		
	}

}
