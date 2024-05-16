package forteenJanuary;



public class PANAGRAM1 {

	
	public static void main(String []args) {
		
		String sentence = "The  By dog";
		
		String  str	= 	sentence.replaceAll("", "").toLowerCase();
		//the quick brown fox jumps over the lazy dog";
		
		
		String s = "";
		
		
		for (char i='a'; i<='z'; i++) {
			
			if(str.indexOf(i)!=-1) {
				
				s=s+i;
			}
		}
		
		System.out.println(s);
		
		if(s.length()==26) {
			System.out.println(" Given String is Pangram");
		}
		
		else {
			System.out.println("Given String is not Pangram");
		}
	
		
	}
}
