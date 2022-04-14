package com.hcl.lambda10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%d, %s, %d]", id, name, price);
	}
}

public class LambdaExpressionExample10 {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		// Adding Products
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(2, "Dell Mouse", 150f));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> p1.name.compareTo(p2.name));
				
		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});
		
		Collections.sort(list, new NameComparator());
		
		//Flintstone age way
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}
		
		//Eventual goal of Function way of writing code is to avoid if/ for/ else/ while 
		//Slightly better way
		list.stream()
				.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.price));
		
	}
}

class NameComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.name.compareTo(p2.name);
	}
}