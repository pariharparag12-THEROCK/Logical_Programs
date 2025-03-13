package september1;

public class Pangram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = "The Quick Brown Fox Jumps Over the lazy Dog";
		
		String sentence1 = sentence.toLowerCase();
		
		String S =  sentence1.replaceAll(" ", "");
		
		//int count = 0;
		
		String str="";
		
		
		for (char i='a'; i<='z'; i++) {
			
			if (S.indexOf(i)!=-1) {
				
				str=str+i;
			}
		}
		
		
//		if (count==26) {
		
		if (str.length()==26) {
			
			System.out.println("Given sentence is Pangram");
		}
		
		else {
			System.out.println("Given sentence is not Pangram");
		}

	}

}
