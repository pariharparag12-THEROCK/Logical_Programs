package november8;

public class EqualAndNotEqual {

	public static void main(String[] args) {
		
		String p = "Hi";
		String q = "Hi";
		
		String j = new String("hi");
		
		String k = new String("Hi");
		
		System.out.println(p==j); //false
		System.out.println(p.equals(j));//false
		System.out.println(p.equalsIgnoreCase(j));//true
		System.out.println(p==k);//false
		System.out.println(p==q);//true
		System.out.println(q==k);//false
		System.out.println(p.equals(k));//true
	}

}
