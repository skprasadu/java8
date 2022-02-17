package com.hcl.bipredicate;

import java.util.function.BiPredicate;

public class JavaBiPredicateAndExample {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> bp1 = (n1, n2) -> (n1 % n2 == 0);
		BiPredicate<Integer, Integer> bp2 = (n1, n2) -> (n1 * n2 > 100);
		
		
		// n1 should divisible by n2 and n1*n2 greater than 100
		System.out.println(bp1.and(bp2).test(120, 6)); // flase
		
		BiPredicate<String, String> bp3 = (s1, s2) -> s1.startsWith(s2);
		BiPredicate<String, Integer> bp4 = (s1, s2) -> s1.length() > s2;
		BiPredicate<String, String> bp5 = (s1, s2) -> s1.endsWith(s2);
		
		// System.out.println(bp3.and(bp4).test("ANAND", "D")); // incompatible types
		// s1 should starts with "P" and ends with "P"
		
		System.out.println(bp3.and(bp5).test("Peter", "P")); // false
		// s1 should starts with "A" and end with "A"
		
		System.out.println(bp3.and(bp5).test("ASHJA", "A")); // true
	}

}
