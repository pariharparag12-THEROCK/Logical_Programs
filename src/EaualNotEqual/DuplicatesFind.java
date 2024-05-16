package EaualNotEqual;

public class DuplicatesFind {

	public static void main(String []args) {
		
		String s = "12349  6771   2349";
		
		char S[] =	s.toCharArray();
		
		for (int i=0; i<=S.length-1; i++) {
			
			for (int j=i+1; j<=S.length-1; j++) {
				
				if(S[i]==(S[j]) ){
					
					System.out.print(S[j] + " ");
				}
			}
		}
	}
}
