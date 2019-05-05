package CollectionsConcept;

import java.util.Vector;

import bsh.Capabilities;

public class VectorConcept {

	public static void main(String str[]) {

		Vector vector = new Vector();
		System.out.println(vector.capacity());
		vector.add(45);
		vector.add("vinita");
		vector.add("vinita N");
		vector.add("vinita Pushkar");
		vector.add("vinita Pushkar Nayama");
		vector.add("vinita P");
		vector.add("vinita N");
		vector.add(null);
		vector.add(4);
		vector.add("vinita N");
		vector.add("vinita N");
		vector.contains("viintaaa");
		//vector.elementAt(1);
		System.out.println(vector);	
		vector.ensureCapacity(5);
		vector.elementAt(4);
		System.out.println(vector.capacity());
	}
}
