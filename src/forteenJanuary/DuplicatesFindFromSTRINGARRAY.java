package forteenJanuary;

public class DuplicatesFindFromSTRINGARRAY {

	public static void main(String []args) {
		
		int s[] = {1,2,3,4,9,6,7,7,1,2,3,4,9};
		
		//char S[] =	s.toCharArray();
		
		for (int i=0; i<=s.length-1; i++) {
			
			for (int j=i+1; j<=s.length-1; j++) {
				
				if(s[i]==(s[j]) ){
					
					System.out.print(s[j] + " ");
				}
			}
		}
	}
}
