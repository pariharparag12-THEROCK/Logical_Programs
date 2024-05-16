package may9;

public class SwappingOFNumbers {

	public static void main(String[] args) {
		
		int a =200;
		int b =300;
		
		a=a+b; //500
		
		b = a-b; //200
		
		a = a-b; //300
		
		System.out.println(a);
		System.out.println(b);

	}

}
