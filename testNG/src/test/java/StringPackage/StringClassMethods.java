package StringPackage;

public class StringClassMethods {

	public static void main(String[] args) {

		//String s = new String();

		String s = "vinita";
		String v = "VINITA";
		System.out.println(s.equals(v));
		System.out.println(s.equalsIgnoreCase(v));
		System.out.println(s.endsWith("aa"));
		System.out.println(s.indexOf("i"));
		System.out.println(s.lastIndexOf("i"));
		s= s.concat("Nayama");
		System.out.println(s);
		System.out.println(s.charAt(2));
	}

}
