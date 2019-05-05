package JavaConcepts;

public class Demo {

	/*public void m1() {
		System.out.println("void + inside method m1");
	}
	public static int m1(int x) {
		System.out.println("int + inside m1");
		return x;
	}
	public static String m1(String name) {
		System.out.println("String + inside m1");
		return name;
	}
	 */
	public static int[] arraytype() {
		int x[] = {10,20,30};
		return x;
	}
	
	public static void main(String d[]) {

		int p [] = arraytype();
		System.out.println(p[1]);
		/*		Demo d1 = new Demo();
		System.out.println(d1.m1("vinita"));
		System.out.println(d1.m1(50));
//		System.out.println(d1.m1(););
	d1.m1();
	}	
		 */

	}
}
