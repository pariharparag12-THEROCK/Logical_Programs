package coreJavaPractice;

public class Child1 extends Parant1 {

	public void job() {
		System.out.println("Childs job");
	}
	
	
	public void bike() {
		System.out.println("Childs bike");
	}
	
	public void check() {
		System.out.println("Childs Good Evening");
	}
	
	public static void main(String[] args) {
		
		/*
		 * Parant1 orv = new Child1();
		 * 
		 * orv.land(); orv.house();
		 * 
		 * 
		 * orv.check();
		 */
		
		
		
		Parant1 orv = new Child1();
		
		Child1 orv1 = (Child1)orv;
		
		orv1.land();
		orv1.house();
		orv1.bike();
		orv1.job();
		
		orv1.check();		
	}
}
