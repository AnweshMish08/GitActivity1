package com.acc.lkm.InheritanceDemo;

public class Child extends Parent {
	public void sum (int a, int b) {
		System.out.println(a + b);
	}
	public static void main(String[] args) {
		Child child = new Child();
		child.sum(1, 2);
	}
}
