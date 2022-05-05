package com.hcl.defaultmethodexample;

import java.util.ArrayList;
import java.util.List;

public class DefaultMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Animal> list = new ArrayList<>();
		list.add(new Ostrich());
		list.add(new Eagle());
		
		list.forEach(x -> {
			System.out.println("******************");
			x.properties();
			
			if(x instanceof Flyable) {
				((Flyable)x).fly();
			}
			
			if(x instanceof Runnable) {
				((Runnable)x).run();
			}
		});
		
	}

}

class Animal {
	void properties() {
		System.out.println("I breathe and move");
	}
}

class Bird extends Animal {
	@Override
	void properties() {
		// TODO Auto-generated method stub
		super.properties();
		System.out.println("I have feathers");
	}
}

class Eagle extends Bird implements Flyable {
	
}

class Ostrich extends Bird implements Runnable {
	
}

interface Flyable {
	//void badFly();
	
	default void fly() {
		System.out.println("I can fly");
	}
}

interface Runnable {
	//void badRun();
	default void run() {
		System.out.println("I can run");
	}
}
