package JavaConcepts;

public class practiceClass implements Cloneable{
	int i = 10;
	String s = "Vinita";

	public static void main(String[] args) throws CloneNotSupportedException {
	practiceClass obj1 = new practiceClass();
	practiceClass obj2 = new practiceClass();
		obj2.clone();
		obj2.i = 20;
		obj2.s = "Vinita Nayama";
		System.out.println("value of i=..."+obj2.i+"value of s1=..."+obj2.s);
		
	}
}
