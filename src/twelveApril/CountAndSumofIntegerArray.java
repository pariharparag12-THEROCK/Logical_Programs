package twelveApril;

public class CountAndSumofIntegerArray {


	public static void main(String[]args){
		
      	int num[] = {1, 2,3,8,6,5,1,3,2};
        
        System.out.println("The length of array is : " + num.length);
        
        int sum = 0; 
            
        
        for (int i=0 ; i<=num.length-1; i++) {
        	
        	
        	//if (num[i]!=-1) {
        		
        		sum = sum + num[i];
        	//}
        }
        
        
        System.out.println("The sum of array is : "+ sum);
  }
}
