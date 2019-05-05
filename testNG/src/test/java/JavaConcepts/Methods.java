package JavaConcepts;

public class Methods {

	public static void main(String s[]) {
		Methods method  = new Methods();
		method.m1();
		method.sub(12, 14);
		method.sum(12, 13);
		method.name("vini");
	}
	public void m1() {
		
		System.out.println("Inside m1 method");
	}
	public int sum(int x, int y) {
		System.out.println("inside a sum method");
		return x+y;
	}
	public int sub(int x, int y) {
		System.out.println("inside a sub method");
		return x-y;
		
	}
	public String name(String s) {
		//return new String();
		return null;
		}
}
