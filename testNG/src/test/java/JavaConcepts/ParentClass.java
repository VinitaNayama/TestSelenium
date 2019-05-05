package JavaConcepts;
	
public class ParentClass implements ChildClass,Child2 {
	public ParentClass() {
		
	}
	
	public static void main(String[] args) {
		ParentClass p = new ParentClass();
		System.out.println(p.m1(30));
		System.out.println(p.m1("vini"));
		System.out.println(p.m1(6));
		System.out.println(ChildClass.x);
	}
	public String m1(){
		System.out.println("iside Parent m1");
		return "";	
	}

	public int m1(int x) {
		return x;
	}
	public int m1(String name) {
		return 0; 
	}


}

