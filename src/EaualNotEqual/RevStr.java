package EaualNotEqual;



public class RevStr {

	public static void main(String []args) {
		
		 String sentence = "the Sun is Brigting star";
		 
		 char s[] = sentence.toCharArray();
		 
		 String reverse = "";
		 
		 for(int i =s.length-1; i>=0; i--) {
			 
			 reverse = reverse + s[i];
		 }
		 
		 System.out.println(reverse);
	}
}
