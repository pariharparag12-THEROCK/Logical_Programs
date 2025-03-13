package november8;

public class NumberOfVowelsRemovefromString {

	public static void main(String[] args) {
		
		String sentence = "MumbaI";
		
		System.out.println(sentence);
		
		char S[] = sentence.toLowerCase().toCharArray();
		
		int count=0;
		
		for (int i=0; i<=S.length-1; i++) {
			
			if (S[i]=='a' || S[i]=='e' || S[i]=='i' || S[i]=='o' || S[i]=='u' ) {
				
				continue;
			}
			
			else {
				
				System.out.print(S[i]+" ");
				
				count= count+1;
			}
			
			
		}
		System.out.println();
		
		System.out.println("The number of count is : "+ count);
	}

}
