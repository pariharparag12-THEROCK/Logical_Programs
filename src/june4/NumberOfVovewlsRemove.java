package june4;

public class NumberOfVovewlsRemove {

	public static void main(String[] args) {
		
		String sentence = "Mumbai";
		
		System.out.println(sentence);
		
		//char c [] = sentence.toCharArray();
		
		int count=0;
		
		for (int i=0; i<=sentence.length()-1; i++) {
			
				char c	=	sentence.charAt(i);
			
			if (c=='a'|| c=='e' || c=='i' || c=='o' || c=='u') {
				
				continue;
			}
			
			else {
				
				System.out.print(c+" ");
				
				count = count+1;
			}
			
		}
		
		System.out.println();
		
		System.out.println(count);
	}

}
