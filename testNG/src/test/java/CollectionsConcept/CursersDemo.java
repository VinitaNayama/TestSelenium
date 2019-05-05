package CollectionsConcept;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursersDemo {

	public static void main(String s[]) {
		Vector v = new Vector();
		Enumeration itr = v.elements();
		Iterator itrr = v.iterator();
		ListIterator litr = v.listIterator();
		System.out.println(itr.getClass().getName());
		System.out.println(itrr.getClass().getName());
		System.out.println(litr.getClass().getName());
		
	}
}
