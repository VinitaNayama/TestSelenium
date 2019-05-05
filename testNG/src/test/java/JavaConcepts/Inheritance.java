package JavaConcepts;

public class Inheritance {

	public static void main(String[] s) {

		StringBuffer sb = new StringBuffer();
		//sb.
		Inheritance heritance = new Inheritance();

		String p =heritance.m1(new String("java"));
		System.out.println(p);
		heritance.m1(new StringBuffer("Selenium"));
		//		System.out.println("Hello");
	//	heritance.m1(null);
	}

	public String m1(String d) {
		return d;
		//System.out.println("Inside String version");
	}
	public void m1(StringBuffer sb) {
		System.out.println("Inside String Buffer");
	}

}
