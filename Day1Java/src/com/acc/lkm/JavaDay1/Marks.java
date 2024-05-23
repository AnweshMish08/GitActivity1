package com.acc.lkm.JavaDay1;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of the student in 4 subject : ");
		int[] marks = new int[4];
		for (int i = 0; i < 4; i++) {
			marks[i] = sc.nextInt();
		}
		int total = 0;
		for (int i = 0; i < 4; i++) {
			total += marks[i];
		}
		double percent = (double)(total*100/400);
		System.out.println("Percentage secured : " + percent);
	}
}
