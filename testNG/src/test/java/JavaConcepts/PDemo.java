package JavaConcepts;

import java.io.FileNotFoundException;

public class PDemo {

	  void m1() {
		System.out.println("m1 int x");
	}
	public float m1(float x) throws FileNotFoundException {
		System.out.println("m1 float x");
		return x;
	}
	public void m1(String s) {
		System.out.println("inside string s");
	}
	public void m1(String ...x) {
		System.out.println("inside var-arg method");
	}
	public void m1(Object o) {
		System.out.println("inside Object o");
	}
	public void m1(float ...x) {

	}

	public static void main(String[] d)throws FileNotFoundException  {
		PDemo obj = new PDemo();
		obj.m1();
		System.out.println(obj.m1(11.3F));
		//	obj.m1(new Object());
		//System.out.println(obj.m1("vinita"));
		obj.m1(110, 12);
	}
}
