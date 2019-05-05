package ExceptionHandlingTopic;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsKeyward {

	public static void main(String args[])throws FileNotFoundException, InterruptedException {
	PrintWriter pw= new PrintWriter("abc.txt");
		//pw.println("hi");
	System.out.println("hi ! hw r u ");	
	Thread.sleep(2000);
		System.out.println("hello");
	}
}
