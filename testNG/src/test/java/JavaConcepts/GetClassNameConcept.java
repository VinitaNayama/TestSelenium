package JavaConcepts;

import java.lang.reflect.Method;

public class GetClassNameConcept {

	public static void main(String[] args) {
		int count =0;
		Object o = new StringBuilder();
		Class c = o.getClass();
		System.out.println("Fully qualified name of the class:"+c.getName());

		Method []m = c.getDeclaredMethods();
		System.out.println("Method information: ");
		for(Method m1 :m) {
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Total no of methods:"+count);
	}
}
