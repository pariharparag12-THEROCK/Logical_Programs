package Company_Programs;


public class ImplementationClass extends Interface1/*, Interface2*/{

//	@Override
//	public void creditcard() {
//		
//		System.out.println("Credit card information");
//		
//	}

	@Override
	public void debitcard() {
		System.out.println("Debit card information");
	}

	
	public static void main(String args[]) {
		
		ImplementationClass orv = new ImplementationClass();
		
//		orv.creditcard();
		orv.debitcard();
	}
	
	
}
