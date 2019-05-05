package IOPackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOCncept {

	public static void main(String[] args) throws IOException {

		/*File f = new File("vinita.txt");
		boolean b= f.mkdir();
		System.out.println(b);
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.exists());
		System.out.println(f.createNewFile());
		System.out.println(f.exists());		
		File f1 = new File("folder1", "demo.txt");
		 */	
		/*File f = new File("E:\\TestDirectory","test1.txt");
		System.out.println(f);
		String []s = f.list();
		System.out.println(s);
		System.out.println(f.exists());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		boolean b = f.createNewFile();
		String []s1 = f.list();
		System.out.println(s1);
		 */


		int count = 0;
		File f = new File("E:\\TestDirectory\\vinita", "Directory1");
		f.mkdir();
		File f3 = new File("E:\\\\TestDirectory\\\\vinita\\Directory1","textFile1");
		File f4 = new File("E:\\\\TestDirectory\\\\vinita\\Directory1","textFile2");
		File f5 = new File("E:\\\\TestDirectory\\\\vinita\\Directory1","subDirectory");

		String []list = f.list();

		for(String newList  : list) {

			File f1 = new File(f,newList);

			if(f1.isDirectory()) {
				count++;
				System.out.println(newList);
			}
		}
		System.out.println(count);
		/*System.out.println(list);
		f3.createNewFile();
		f4.createNewFile();
		f5.mkdir();
		 */


		File f1 = new File("E:\\TestDirectory\\vinita", "File1");
		f.createNewFile();
		
		FileWriter fw = new FileWriter("File1");
		fw.write(101);
		fw.write("democlass concept");
	/*	boolean file = f.createNewFile();
		System.out.println(file);
*/
	}
}
