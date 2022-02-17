package com.hcl.bipredicate;

import java.util.function.BiPredicate;

public class JavaBiPredicateNegateExample {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bp1 = (n1, n2) -> (n1 % n2 == 0);
		BiPredicate<Integer, Integer> bp2 = (n1, n2) -> (n1 * n2 > 100);

		// n1 should not be divisible by n2 and n1*n2 not greater than 100

		System.out.println(bp1.negate().test(120, 6)); // flase
		System.out.println(bp2.negate().test(12, 7)); // true

		BiPredicate<String, String> bp3 = (s1, s2) -> s1.startsWith(s2);
		BiPredicate<String, Integer> bp4 = (s1, s2) -> s1.length() > s2;
		BiPredicate<String, String> bp5 = (s1, s2) -> s1.endsWith(s2);

		// s1 should not starts with s2
		System.out.println(bp3.negate().test("ANAND", "D")); // true

		// s1 lengthe should not greater than s2
		System.out.println(bp4.negate().test("PETER", 5)); // true

		// s1 should not ends with s2
		System.out.println(bp5.negate().test("ASHJA", "A")); // false
	}

}
