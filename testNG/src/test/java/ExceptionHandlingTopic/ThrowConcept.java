package ExceptionHandlingTopic;

public class ThrowConcept {

	static int x = 10/0;
	
	public static void main(String[] args) {

	
		try {
			System.out.println(10/0);
			Thread.sleep(1000);
		}
		
		catch( ArithmeticException | InterruptedException e ) {
			
			System.out.println(e.getMessage());
		}
	}
}
