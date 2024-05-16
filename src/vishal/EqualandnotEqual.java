package vishal;

public class EqualandnotEqual {

	public static void main(String[] args) {
		
		String p = "Hi";
		String q = "Hi";
		
		String j = new String("hi");
		
		String k = new String("hi");
		
		
		System.out.println(p==j);
		System.out.println(p.equals(j));
		System.out.println(p.equalsIgnoreCase(j));
	}
}
