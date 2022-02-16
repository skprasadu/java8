package com.hcl.functionalInterface.examples;

interface Doable {
	default void doIt() {
		System.out.println("Do it now");
	}
}

@FunctionalInterface
interface Sayable2 extends Doable {
	void say(String msg); // abstract method
}

public class FunctionalInterfaceExample3 implements Sayable2 {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample3 fie = new FunctionalInterfaceExample3();
		fie.say("Hello there");
		fie.doIt();
	}
}
