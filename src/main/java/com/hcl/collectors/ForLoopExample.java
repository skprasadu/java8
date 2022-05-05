package com.hcl.collectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ForLoopExample {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		//Looping using index
		for(int i = 0; i < productsList.size(); i++) {
			Product x1 = productsList.get(i);
			System.out.println("Non functional way " + x1);
		}

		//iterator
		for(Product x1: productsList) {
			System.out.println("Non functional way " + x1);
		}
		
		//Getting closer to functional way
		productsList.forEach(new Consumer<Product>() {
			@Override
			public void accept(Product x1) {
				System.out.println("Boring Anoynamous inner type way " + x1);
			}
		});
		
		//forEach function with Consumer Anoynamous inner type
		productsList.stream().forEach(new Consumer<Product>() {
			@Override
			public void accept(Product x1) {
				System.out.println("Boring Anoynamous inner type way " + x1);
			}
		});
		
		//in lambda, if there are or more arguments 
		productsList.stream().forEach((x1/*, x2*/) -> {
			System.out.println("Still boring way " + x1);
		});
		
		productsList.stream().forEach((x1/*, x2)*/) -> System.out.println("Slightly better " + x1));
		productsList.stream().forEach( x1 -> System.out.println("Better " + x1) );
		//productsList.stream().forEach( System.out.println(x));
		System.out.println("*****");
		
		//Method reference, the best way, where possible
		productsList.stream().forEach(System.out::println);
		
		Collections.sort(productsList, (p1, p2) ->  p1.getName().compareTo(p2.getName()));
		Collections.sort(productsList, ForLoopExample::compare );

	}
	
	private static int compare(Product p1, Product p2) {
		return p1.getName().compareTo(p2.getName());
	}

}
