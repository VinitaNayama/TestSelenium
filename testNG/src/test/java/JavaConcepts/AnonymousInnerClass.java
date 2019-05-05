package JavaConcepts;

public class AnonymousInnerClass {

	public static void main(String[] args) {

		Popcornn obj = new Popcornn() {

			public void taste() {
				System.out.println("spicy");
			}
		};
		obj.taste();
		Popcornn obj2 = new Popcornn();
		obj2.taste();

		Popcornn obj3 = new Popcornn() {
			public void taste() {
				System.out.println("Sweet");
			}
		};
		obj3.taste();
		System.out.println(obj.getClass().getName());
		System.out.println(obj2.getClass().getName());
		System.out.println(obj3.getClass().getName());
	}

}
class Popcornn {

	public void taste() {
		System.out.println("Salty");
	}
	;;;;;
	;;;;;
}