package fiveFEBURARY;

public class ReverseString1 {

	public static void main(String[] args) {
	
			String sentence = "The Sun is Brighting Star";
			
			char S[] = sentence.toCharArray();
			
			String reverse = "";
			
			for (int i=S.length-1; i>=0; i--) {
				
				reverse = reverse + S[i];
				System.out.print(reverse);
				reverse ="";
			}
			
		//	System.out.println(reverse);
			
			
	}

}
