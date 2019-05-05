package JavaConcepts;

public class Popcorn{

	int x = 10;
	static int y = 20;

	class Inner{
		int x = 100;
		int y = 200;
		public void m1() {
			int x = 50;
			int y = 50;
			System.out.println(Popcorn.this.x);
			System.out.println(this.y);
		}
	}
	public void m2() {
		Inner obj = new Inner();
		obj.m1();
	}

	public static void main(String d[]) {
	Popcorn p = new Popcorn();
		p.m2();
	}
}

