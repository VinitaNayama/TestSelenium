package IOPackage;

import java.io.File;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;

public class FileReaderConcept {

	public static void main(String[] args) throws IOException {

		//	FileWriter fw = new FileWriter("pushkar.txt");
		File f = new File("FileWriter.txt");
		char[] ch = new char[(int)f.length()];
		FileReader fr = new FileReader("FileWriter.txt");
		/*int i = fr.read();
		while(i!= -1) {
			System.out.print((char)i);	
			i = fr.read();

		}
		fr.close();
		 */
		fr.read(ch);
		for(char ch1 : ch) {
			System.out.print(ch1);
		}
	}

}
