package JavaConcepts;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TypeCastingRulee {

	public static void main(String s[]) {


			Throwable t = new EOFException("Throwable class");
				Exception e = (IOException)t;
				System.out.println(e);
				
	}
}
