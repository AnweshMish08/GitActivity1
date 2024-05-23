package com.acc.lkm.JavaDay2;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Java");
		String str2 = new String("java");
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.replace("J", "A"));
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(1, 3));
		System.out.println(str.isEmpty());
		System.out.println(str.endsWith("a"));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.compareTo(str2));
		StringBuilder stringbuilder = new StringBuilder("JAVA");
		System.out.println(stringbuilder.length());
	}
}