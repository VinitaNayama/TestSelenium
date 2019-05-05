package CollectionsConcept;

public class ConstructorConcept {

	
	String name;
	int age;
	int rollNo;
	


public ConstructorConcept (String name, int age) {
	
	this.name = name;
	this.age =age;

	System.out.println(name);
	System.out.println(age);
}

public static void main(String d[]) {
	
	ConstructorConcept cc = new ConstructorConcept("Vinita", 12);
}			
}