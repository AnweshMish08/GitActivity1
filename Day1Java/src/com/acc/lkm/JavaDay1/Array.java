package com.acc.lkm.JavaDay1;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int len, element;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		len = sc.nextInt();
		int[] array = new int[len + 1];
		System.out.println("Enter " + len + " elements : ");
		for (int i = 0; i < len; i++) {
			array[i] = sc.nextInt();
		}
		for(int arr : array) {
			System.out.print(arr + " ");
		}
		System.out.println();
		System.out.println("Enter the element which you want to insert");
		element = sc.nextInt();
		array[len] = element;
		for(int arr : array) {
			System.out.print(arr + " ");
		}
	}
}
