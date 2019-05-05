package ExceptionHandlingTopic;

public class EHandling {

	public static void main(String d[]) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
