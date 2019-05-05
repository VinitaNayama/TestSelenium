package ExceptionHandlingTopic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ExceptionHandling {

	int x,y;
	String z;
	public static void main(String s[]) throws IOException {
		m1();
		ExceptionHandling ed = new ExceptionHandling();
		String z =  ed.add(10,40,"vini");
		System.out.println(z);
		/*	int [] x = new int[4];
		System.out.println(x[3]);
		x[3] = 100;
		System.out.println(x[3]);
		 */
		System.out.println("hello vinita");
		AutoCloseable e = new BufferedReader(new Reader() {
			
			@Override
			public int read(char[] cbuf, int off, int len) throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void close() throws IOException {
				// TODO Auto-generated method stub
				
			}
		});
		
	}	

	public static void m1() throws IOException{
		try {
			Thread t = new Thread();
			t.setPriority(11);
			try(BufferedReader br = new BufferedReader(new FileReader("xyz.txt"))){
			}
			catch(FileNotFoundException e) {
				int x = 10%2;				}

				try {
					int x =  Integer.parseInt("String");
				}
				catch(NumberFormatException ez) {
					int x = 10;
				}
			
		}
		catch(IllegalArgumentException |NullPointerException e){
		}	
		finally {
			System.out.println("finally");
		}
	}
	public String add(int a, int b , String s) {
		x= a;
		y= b;
		z =s;
		String c= a+b+s;
		return c;
	}
}


