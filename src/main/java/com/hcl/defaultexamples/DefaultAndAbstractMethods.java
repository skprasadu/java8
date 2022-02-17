package com.hcl.defaultexamples;

interface Sayable {
	// Default method
	default void say() {
		System.out.println("Hello, this is default method");
	}

	// Abstract method
	void sayMore(String msg);
}

public class DefaultAndAbstractMethods implements Sayable {
	public void sayMore(String msg) { // implementing abstract method
		System.out.println(msg);
	}

	public static void main(String[] args) {
		DefaultAndAbstractMethods dm = new DefaultAndAbstractMethods();
		dm.say(); // calling default method
		dm.sayMore("Work is worship"); // calling abstract method

	}
}
