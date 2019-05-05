package JavaConcepts;

public class StaticNestedClass {
	int x = 10;
	static int y = 100;
	public static void main(String[] args) {
		System.out.println("Outer inner class");
		StaticNestedClass n =new StaticNestedClass();
		System.out.println(n.x);
	}
	static class Inner{
		public static void m1() {
			System.out.println(StaticNestedClass.y);
		}	
		int z = 30;
		public static void main(String[] args) {
			System.out.println("Inner nested class");
			new Inner().m1();
		//	WebDriver driver;
		}

	}
}
