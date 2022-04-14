package com.hcl.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

class Product {
	int id;
	String name;
	float price;
	

	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class CollectorsExample {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		//select price from product 
		//map does project of column(s)
		//returns list of product price
		// [25000, 30000, 28000, 28000, 90000]
		List<Float> productPriceList = productsList.stream()
				.map(x -> x.price) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.println(productPriceList);
		
		/****************************/
		//select price from product where price > 28000
		//map does project of column(s)
		//returns list of product price
		// [25000, 30000, 28000, 28000, 90000]
		List<Float> productPriceList1 = productsList.stream() //Stream is Source
				.filter(x -> x.price > 28000.0) //intermediate functions
				.map(x -> x.price) // fetching price, intermediate functions
				.collect(Collectors.toList()); // collecting as list, terminal operation
		System.out.println(productPriceList1);
		
		/****************************/
		//The above code and below code are exactly same
		Stream<Product> st = productsList.stream() //Stream is Source
				.filter(x -> x.price > 28000.0); //intermediate
		Stream<Float> st1 = st
				.map(x -> x.price); //intermediate
		List<Float> productPriceList2 = st1
				.collect(Collectors.toList()); // collecting as list, terminal operation
		System.out.println(productPriceList2);
		/****************************/
		//select price, count(price) from product group by price
		//returns 2 columns price and count of price
		//{25000: 1, 30000: 1, 28000: 2, 90000: 1}
		Map<Float, Long> productGroupByPrice = productsList.stream()
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.counting()));
		
		System.out.println(productGroupByPrice);
		
		//select price, count(price) from product group by price
		//returns 2 columns price and count of price
		//{25000: 1, 28000: 2}
		Map<Float, Long> productGroupByPrice1 = productsList.stream()
				.filter(x -> x.price < 30000)
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.counting()));
				
		System.out.println(productGroupByPrice1);
	}
}
