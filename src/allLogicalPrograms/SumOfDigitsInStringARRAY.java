package allLogicalPrograms;

public class SumOfDigitsInStringARRAY {


	
	public static  int Method1(String S[]) {
		
		
		int a[] = new int[S.length];
	     
	   
	     int count = 0;
	     
	     int sum = 0;
	     
	     for (int i=0; i<=a.length-1; i++) {
	    	 
	    	a[i] = Integer.parseInt(S[i]);  //String at i index converts into integer
	    	 
	    	 if(a[i]>=0 && a[i]<=10) {
	    		 
	    		 count = count + 1;
	    	 }
	    	 
	    	 sum = sum+a[i];
	    	 
	     }
	     
	     
	
	     
	     System.out.println("The count of numbers present in array : " + count);
	     
	     
	     return sum;
	}
	
	
	public static void main(String[] args) {
		
		
		 String S[] = {"0", "1", "2", "3","4","5","6","7","8","9"};
	     System.out.println(Method1(S));

	    
	}




	
	
	

}
