package com.acc.lkm.JavaDay1;

import java.util.*;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0; int b = 1;
		System.out.println(a);
		System.out.println(b);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i < n - 2; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	    }
}
