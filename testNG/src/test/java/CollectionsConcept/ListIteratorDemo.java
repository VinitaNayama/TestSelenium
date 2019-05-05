package CollectionsConcept;
import java.util.*;
public class ListIteratorDemo  {

	public static void main(String d[]) {

		LinkedList <String>list = new LinkedList<String>();
		list.add("Vinita");
		list.add("Dhakad");
		list.add("Nayama");
		list.add("Sunil");
		list.add("Dhakad");
		System.out.println(list);//[vinita,Dhakad,Nayama,Sunil,Dhakad]
		ListIterator itr = list.listIterator();
		while(itr.hasNext()) {
			String s=(String)itr.next();
			if(s.equals("Dhakad")) {
				itr.remove();
			}
			else if(s.equals("Nayama")) {
				itr.add("Pushkar Nayama");
			}
			else if(s.equals("Vinita")) {
				itr.set("Vinitan");
			}
		}
		System.out.println(list);//[Vinita,Pushkar Nayama,Nayama]
	}
}