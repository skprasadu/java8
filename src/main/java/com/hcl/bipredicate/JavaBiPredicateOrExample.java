package com.hcl.bipredicate;

import java.util.function.BiPredicate;

public class JavaBiPredicateOrExample {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bp1 = (n1, n2) -> (n1 % n2 == 0);
		BiPredicate<Integer, Integer> bp2 = (n1, n2) -> (n1 * n2 > 100);

		// n1 should be divisible by n2 or greater than 100
		System.out.println(bp1.or(bp2).test(120, 7)); // true
		System.out.println(bp1.or(bp2).test(13, 5)); // false

		BiPredicate<String, String> bp3 = (s1, s2) -> s1.startsWith(s2);
		BiPredicate<String, Integer> bp4 = (s1, s2) -> s1.length() > 5;
		BiPredicate<String, String> bp5 = (s1, s2) -> s1.endsWith(s2);

		// name starts with "A" or not ends with "p"
		// System.out.println(bp3.or(bp4)); // bp3 and bp4 are incompatible types

		System.out.println(bp3.or(bp5).test("Peter", "r")); // true
		System.out.println(bp3.or(bp5).test("Anand", "A")); // true
	}
}
