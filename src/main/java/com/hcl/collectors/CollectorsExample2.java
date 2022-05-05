package com.hcl.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

// Plain Old Java Object (POJO) - Value Object
class Product {
	private int id;
	private String name;
	private float price;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{\"name\":" + name + ", \"price\":" + price + "}" ;
	}
}

public class CollectorsExample2 {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		
		//select * from product 
		List<Product> productPriceList1 = productsList.stream()
				//.map(x -> x.getPrice()) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.print("select * from product");
		System.out.println(productPriceList1);
		
		//select price from product 
		//map does project of column(s)
		//returns list of product price
		// [25000, 30000, 28000, 28000, 90000]
		List<Float> productPriceList2 = productsList.stream()
				.map(x -> x.getPrice()) // fetching price
				.collect(Collectors.toList()); // collecting as list
		System.out.print("select price from product");
		System.out.println(productPriceList2);
		
		/****************************/
		//select price from product where price > 28000
		//map does project of column(s)
		//returns list of product price
		// [25000, 30000, 28000, 28000, 90000]
		List<Float> productPriceList3 = productsList.stream() //Stream is Source
				.map(x -> x.getPrice()) // fetching price, intermediate functions
				.filter(x -> x > 28000.0) //intermediate functions
				.collect(Collectors.toList()); // collecting as list, terminal operation
		System.out.print("select price from product where price > 28000");
		System.out.println(productPriceList3);
		
		/****************************/
		//The above code and below code are exactly same
		//O(1)
		Stream<Product> st = productsList.stream(); //Stream is Source
		
		//select price from product
		//O(1)
		Stream<Float> st1 = st
				.map(x -> x.getPrice()); //intermediate
		
		// the filter applies on the price I get 
		//O(1)
		Stream<Float> st2 =	st1
				.filter(x -> x > 28000.0); //intermediate
		
		//Finally I collect them in a list and print it
		//Terminal function where of O(????) will happen
		List<Float> productPriceList4 = st2
				.collect(Collectors.toList()); // collecting as list, terminal operation
		System.out.print("select price from product where price > 28000 (breakdown)");
		System.out.println(productPriceList4);
		/****************************/
		
		//how many products are of same price
		//select price, count(price) from product group by price
		//returns 2 columns price and count of price
		//{25000: 1, 30000: 1, 28000: 2, 90000: 1}
		Map<Float, Long> productGroupByPrice = productsList.stream()
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.counting()));
		
		System.out.println(productGroupByPrice);
		
		//select price, count(price) from product group by price where price < 30000
		//returns 2 columns price and count of price
		//{25000: 1, 28000: 2}
		Map<Float, Long> productGroupByPrice1 = productsList.stream()
				.filter(x -> x.getPrice() < 30000)
				.collect(Collectors.groupingBy(Product::getPrice, Collectors.counting()));
				
		System.out.println(productGroupByPrice1);
		
		/*
		 * this should return a single Product or Optional<Product>
		Product product = productsList.stream()
				.filter(x -> x.getId() == 1)
				.collect(?????); 
		*/
		
		/*
		 * this should return a single Product or Optional<Product>
		Product product = productsList.stream()
				.filter(x -> x.getId() == 8)
				.collect(?????); 
				
				//*** this returns product = null
				 
		Optional<Product> product1 = productsList.stream()
				.filter(x -> x.getId() == 8)
				.collect(?????); 
				
				//*** this returns Optional<product> 
				product1.ifPresent
				 
		*/
	}
}
