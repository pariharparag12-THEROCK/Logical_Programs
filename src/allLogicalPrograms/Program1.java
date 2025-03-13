package allLogicalPrograms;

public class Program1 {
		
	
	public static void main(String[]args){
		
      	int num[] = {1, 2,3,8};
        
        int target = 10; 
        
		for(int i=0; i<=num.length-1; i++){
		            
		            for(int j=i+1; j<=num.length-1; j++){
		                
		                if ((num[i]+num[j]) == target){
		                    
		                	System.out.println("The Two Numbers whose sum are equals to target are : " + num[i]+ " and "+ num[j]);
		        			System.out.println(num[i]+" is present at place : "+ i +" \n"+num[j]+" is present at place : "+j);
		                }
		                
		            }
		        }      
            
  }
	
	
}
