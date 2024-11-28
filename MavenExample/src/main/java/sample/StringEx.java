package sample;

public class StringEx {

	public static void main(String[] args) {
		String s="Diya Joseph";
		System.out.println(s);
		char arr[]= {'a','b','c'};
		String s1=new String(arr);
		System.out.println(s1);
		//Length
		int l=s.length();
		System.out.println(l);
		//concatenation
		String s2="hi";
		System.out.println(s2.concat(s));
		//contains
		String s3="I am Diya from Kerala";
		System.out.println(s3.contains("Kerala"));
		//equals
		String s4="hi";
		String s5="hi";
		String s6="hello";
		String s7="Hi";
		System.out.println(s4.equals(s5));
		System.out.println(s5.equals(s6));
		System.out.println(s4.equals(s7));

	}

}
