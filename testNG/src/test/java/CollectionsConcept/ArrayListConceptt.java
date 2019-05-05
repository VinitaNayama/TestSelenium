package CollectionsConcept;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Vector;

public class ArrayListConceptt {

	public static void main(String str[]) {
		ArrayList al = new ArrayList();
		Vector v = new Vector();
		System.out.println(v instanceof RandomAccess);
		
		LinkedList list = new LinkedList();
		System.out.println(al instanceof Serializable);
		System.out.println(list instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(list instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		System.out.println(list instanceof RandomAccess);
		
		
		/*		al.add(4);
		al.add(4);
		al.add(4);
		al.add(45);
		al.add(null);
		al.add(2, "pushkar");
		boolean b = al.isEmpty();
		System.out.println(b);
		//al.addAll(al);
		
		al.remove(1);
	//	System.out.println(al);
		al.add("Vinita");
		al.add(1, "Nayama");
		int size = al.size();
		al.contains(null);
		System.out.println(size);
		System.out.println(al);
		
*/	}
}
