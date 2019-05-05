package JavaConcepts;

public class InnerConcept {

	interface demo1{
		void m1();
	}

	interface demo2{
		void m2();
	}

	class DemoClass1 implements demo1{
		public void m1() {
			System.out.println("inside innder interface 1");
		}
	}
	class DemoClass2 implements demo2{
		public void m2() {
			System.out.println("inside innder interface 1");
		}
	}
	
	public static void main(String d[]) {
		InnerConcept obj = new InnerConcept();
		InnerConcept.DemoClass1 obj2 = obj.new DemoClass1();
		obj2.m1();
		
	}
}

