package Company_Programs;

public class Program1 {
		
	
	public static void main(String[]args){
		
      	int nums[] = {1, 2,3,8};
        
        int target = 10; 
        
        for ( int i=0; i<=nums.length-1; i++){
        
        		for (int j=i+1; j<=nums.length-1; j++){
            
            		if((nums[i]+nums[j])==target){
                	
                         System.out.println("Numbers are "+ nums[i]+ " and "+ nums[j]);
                         
                         System.out.println("These are positioned at indexes " + i + " and "+ j);
            		}
                 
        
                }
        }        
            
  }
	
	
}
