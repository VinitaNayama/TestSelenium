package StringBufferPackage;

public class StringBufferClass {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity());
			sb.append("abcdefghijklmnopqrstuvwxyz");
			System.out.println(sb.capacity());
			StringBuffer sb1= new StringBuffer(10);
			StringBuffer sb2 = new StringBuffer("vini");
			System.out.println(sb2.capacity());
			System.out.println(sb1.capacity());
			System.out.println(sb1);
			}
}