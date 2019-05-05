package JavaConcepts;

public class VariablesConcept {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

		/*char a  ='a';
		char b = 'b';
		char c = (char)(a+b);
		System.out.println(c);
		 */

		/*int a = 10;
		double b = 10.5;
		int c =(int)(a+b);
		System.out.println(c);
		 */

		/*
		float f = 0.4f;
		double s = 10.33;
		double c = (double)(f+s);
		System.out.println(c);
		 */

		/*float f = 10f;
		float b= 20f;
		float c = (f+b);
		System.out.println(c);
		 */

		/*long l = 10;
		long b = 20;
		int c = (int)(l+b);
		System.out.println(c);
		 */	

		/*float f = -50f;
	 	float b = 0f;
		System.out.println(-50f/0f);
		 */

		/*int a = 50;
		int b = 0;
		System.out.println(50/0);
		 */

		/*String a = "abc";
		int b = 7, c = 100, f = 50, e=23;
		System.out.println(a+c+f+e);//abc1005023
		System.out.println(b+c+f+a);//157abc
		System.out.println(b+c+f);//157
		System.out.println(a+7+a+c+f+a+e+a);//abc7abc10050abc23abc
		 */

		/*String s = "Vinita";
		int x = 10, y = 20, z = 30;
		s= (s+y+z);
		//y = s+x+z;
		System.out.println(s);
		 */

		/*	boolean x =true;
		boolean y= true;
		System.out.println(x!=y);
		 */

		/*char a = 'a';
		char b = 'b';
		System.out.println(a!=b);
		 */

		/*	String s = "pushkar ";
		String b ="vinita";
		s=b;
		System.out.println(s==b);
		 */

		/*char a ='b';
		double c = 97.0;
		System.out.println(a!=c);
		 */

		/*StringBuffer sb = new StringBuffer("Java");
		StringBuffer sb1 = new StringBuffer("Java");
		System.out.println(sb!=sb1);
		 */

		/*	StringBuffer sb = new StringBuffer("Javaaaaaaaaaaaaaa");
		StringBuffer sb1 =new StringBuffer("Javaaaaaaaaaaaaaa");
		System.out.println(sb.equals(sb1));
		System.out.println(sb.append("Core"));
		System.out.println(sb.append(sb1));
		System.out.println(sb.capacity());
		System.out.println(sb1.capacity());
		 */	

		/*	String s = "vinita";
		System.out.println(s.toUpperCase());
		System.out.println(s.indexOf());
		 */

		/*
		Object o = new Object();
		String s = "xyz";
		StringBuffer sb = new StringBuffer();
		System.out.println(o==s);
		 */	

		/*
		 Object o = new Object();
		Runnable r = new Thread();
		String s = "xyz";
		StringBuffer sb = new StringBuffer();
		System.out.println(o instanceof Thread);
		 */

		/*boolean b=false;
		boolean c =true;
		System.out.println(b&c);//false
		System.out.println(b|c);//true
		System.out.println(b^c);//true

		int x =50;
		int y=60;
		System.out.println(x&y);//
		System.out.println(x|y);//
		System.out.println(x^y);//
		 */

		/*		int x = 130;
		byte b = (byte)x;
		System.out.println(b);
		 */		
		/*int x = (10<20)? 10:30;
		System.out.println(x);

		int z = (45<34)?30 :((45<34)? 54:23);//
		System.out.println(z);*///23


		//Object obj = Class.forName("JavaConcepts.Test1").newInstance();
		//System.out.println(obj instanceof Test1);

		/*Object o = Class.forName("JavaConcepts.Test1").newInstance();
	System.out.println(o.getClass().getName());

	Thread t = new Thread();

	System.out.println(Class.forName("java.lang.Runnable").isInstance(t));
		 */

		int [][][] x = {{{10,20,30},{40,50,60},{45,67,67}}};

//		int [][][] x4 = {{{10,20,30},{34,44},{23,54}}};
		for(int[][] x1 : x) {

			for(int x2[]: x1) {

				for(int x3 : x2) {
					System.out.println(x3);
				}
			}
		}
	}

}

class Test1 {
	/*	Test1(int x){

	}
	 */}