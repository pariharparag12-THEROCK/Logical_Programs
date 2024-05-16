package Prime;

public class Split {

	public static void main(String[] args) {
		

		String sentence =  "Java-is-awesome";
		
		String s[]	= sentence.split("-");
		    
		for(String part : s) {
			System.out.println(part);
		}

		System.out.println("\n" + s.length +"\n");
		
		for(int i=0; i<=s.length-1; i++) {
			System.out.println(s[i]);
		}
		
		}
}
