package JavaConcepts;

public class InnerClass2 {

	int i = 10;
	static int j = 20;
	public void m1() {
		int k = 30;
		final int l = 40; 
		class  MethodLocalInnerClass{

			public void m2() {
				System.out.println(i);
				System.out.println(j);
				System.out.println(k);
				System.out.println(l);
			}
		}
		MethodLocalInnerClass obj = new MethodLocalInnerClass();
		obj.m2();
	}

	public static void main(String d[]) {

		new InnerClass2().m1();
	}
}
