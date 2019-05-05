package JavaConcepts;

public class StaticControlFlow {

	static int i=10;
	
	static {
		m1();
		System.out.println("first static block");
	}
	public static void m1() {
		System.out.println(j);
	}
	
	static {
		System.out.println("second static block");
	}
	
	static int j=20;
	public static void main(String d[]) {
		m1();
		System.out.println("inside main method");
	}
}
