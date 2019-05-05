package JavaConcepts;

public class SingaltonConcept {

	private static SingaltonConcept obj = new SingaltonConcept();
	private SingaltonConcept() {
	}
	public static SingaltonConcept getData() {
		return obj;
	}
	public static void main(String[] args) {
		SingaltonConcept t1 = SingaltonConcept.getData();
	}

}
