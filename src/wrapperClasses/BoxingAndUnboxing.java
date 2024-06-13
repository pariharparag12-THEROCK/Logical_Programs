package wrapperClasses;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
	
		//Autoboxing
		int a =100;
		Integer b =a; // java converts automatically
		System.out.println("AutoBoxing : "+b);
		
		//Boxing 
		int x =90;
		Integer y =	Integer.valueOf(x);
		System.out.println("Boxing : "+y);
		
		
		//Unboxing
		Integer result = 100;
		int newResult =	result.intValue();
		System.out.println("Unboxing : "+newResult);
		
		
		//AutoUnboxing
		Integer marks =78;
		int newmarks = marks; //java converts automatically
		System.out.println("AutoUnboxing : "+newmarks);
	}

}
