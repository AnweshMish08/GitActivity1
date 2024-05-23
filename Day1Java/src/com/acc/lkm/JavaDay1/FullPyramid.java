package com.acc.lkm.JavaDay1;

import java.util.*;

public class FullPyramid {
	 public static void main(String[] args) {
		 	Scanner sc = new Scanner(System.in);
		 	int numOfRows = sc.nextInt();
			for (int i = 1; i <= numOfRows; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		    }

}
