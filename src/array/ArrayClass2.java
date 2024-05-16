package array;

public class ArrayClass2 {

	public static void main(String[]args) {
		
		int f[] = new int[5];
		
		f[0] = 10;
		f[1] = 20;
		f[2] = 30;
		f[3] = 40;
		f[4] = 50;
		//f[5] = 60;
		
		System.out.println(f[2]);
		
		int d = f.length;
		
		System.out.println(d);
		
		System.out.println("Print all numbers :" + "\n");
		
		for(int i= 0; i<d; i++) {
			System.out.println(f[i]);
		}
		
		System.out.println();
	
		System.out.println("Print all numbers in reverse order :" + "\n");
		
		for(int i= d-1; i>=0; i--) {
			System.out.println(f[i]);
		}
		
		
		
	}
}
