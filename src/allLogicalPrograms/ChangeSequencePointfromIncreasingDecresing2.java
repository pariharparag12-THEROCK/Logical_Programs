package allLogicalPrograms;

import java.util.Scanner;

public class ChangeSequencePointfromIncreasingDecresing2 {

	public static int changeSequencing(int arr[]){
		        
		     for (int i=1; i<=arr.length-2; i++){
		            
		            if(arr[i-1]>arr[i] && arr[i]<arr[i+1]){
		                
		                return i; // ← This exits the method IMMEDIATELY when condition is true
		                
		            }
		
		      }
		        
		  return -1;  //This is only reached if the loop finishes without returning
		  // If there is no order in numbers then it Should give -1
		
	}
		    
	
    public static void main(String[] args) {
        
        // int arr[] = {5,4,3,2,10,11};
        
        // System.out.println(changeSequencing(arr));
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a numbers With space"); // 5 4 3 2 10 11---->3(index)  //-4 -3 -2 9 11----> -1
        
        String input = s.nextLine();
        
        String parts[] = input.split(" ");
        
        int arr[] = new int [parts.length];
        
        for(int i=0; i<=parts.length-1; i++){
            
            arr[i]=Integer.parseInt(parts[i]);
        }
        
        System.out.println(changeSequencing(arr));
        
        s.close();
        
    } 
	
}
