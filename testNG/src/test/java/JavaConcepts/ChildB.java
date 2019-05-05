package JavaConcepts;

public class ChildB extends ParentA{

	public void m1() {
		System.out.println("insideChild b");
	}
	
	
	
	public static void main(String d[]) {
		
		ParentA b = new ChildB();
	//	b.m1();
		b.m1(10);	
	}
}