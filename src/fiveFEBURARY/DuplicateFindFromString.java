package fiveFEBURARY;

public class DuplicateFindFromString {

	
	public static void main(String[]args) {
		
		String p = "#768732486ueyri@#&&55";
		
		char S[] =	p.toCharArray();
		
		for (int i=0; i<=S.length-1; i++) {
			
			for(int j=i+1; j<=S.length-1; j++) {
				
				if (S[i]==S[j]  && i!=j) {
					
					System.out.print(S[j] +" ");
				}
			}
		}
	}
}
