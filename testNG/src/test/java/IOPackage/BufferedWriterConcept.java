package IOPackage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedWriterConcept {

	public static void main(String[] args) throws IOException {
		
	//	BufferedWriter bw = new BufferedWriter(new );
		PrintWriter pw = new PrintWriter("FileWriter.txt");
		pw.write("vinita");
		pw.println("Nayama");
		pw.println("pushakr");
		pw.close();
	}
}
