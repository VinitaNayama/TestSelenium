package FileWriter.copy;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {

	public static void main(String d[]) throws IOException {

		FileWriter fw = new FileWriter("FileWriter.txt",true);
		fw.write(100);
		fw.write("urgasoft");
		fw.write('\n');
		char ch[] = {'a','b','c'};
		fw.write(ch);
		fw.write('\n');
		fw.write("Pushkar Vinita");
		fw.flush();
		fw.close();

	}
}
