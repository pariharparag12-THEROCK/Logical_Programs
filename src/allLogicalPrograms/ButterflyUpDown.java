package allLogicalPrograms;

public class ButterflyUpDown {

public static void main(String[] args) {
		
		for (int i=1; i<=4; i++) {
			
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			
			for (int k=4; k>=i; k--) {
				System.out.print("*");
			}
			
			for (int l=3; l>=i; l--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		for (int i=2; i<=4; i++) {
			
			for (int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
			for (int l=2; l<=i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
	
/*	for(int i=1; i<=4; i++){
        
        for(int j=2; j<=i; j++){
            System.out.print(" ");
        }
        
        for(int k=4; k>=i; k--){
            System.out.print("*");
        }
        
        for(int l=3; l>=i; l--){
            System.out.print("*");
        }

         System.out.println();
     }
     
     
      for(int i=2; i<=4; i++){
         
         for(int j=3; j>=i; j--){
             System.out.print(" ");
         }
         
         for(int k=1; k<=i; k++){
             System.out.print("*");
         }
       
         for(int l=2; l<=i; l++){
             System.out.print("*");
         }
         
         System.out.println();
	
      }*/
	
	}

}
