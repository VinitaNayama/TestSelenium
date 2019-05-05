package javaInterviewConcept;

public class ReverseString {

	public static void main(String s[]) {

		String str= "Vinita ";
		String reverse="";

		int len = str.length();

		for(int i=len-1; i>=0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println(reverse);

	}
}
