package com.hcl.bifunctionexamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Java8FunctionExample {

	public static void main(String[] args) {
		Function<Integer, List<Integer>> singleArg = x -> Arrays.asList(x);
		
		List<Integer> result4 = singleArg.apply(8);
		System.out.println(result4);

		// takes two Integers and return an Integer
		BiFunction<Integer, Integer, Integer> add = (x1, x2) -> x1 + x2;

		Integer result = add.apply(2, 3);

		System.out.println(result); // 5

		// take two Integers and return an Double
		BiFunction<Integer, Integer, Double> powr = (x1, x2) -> Math.pow(x1, x2);

		Double result2 = powr.apply(2, 4);

		System.out.println(result2); // 16.0

		// take two Integers and return a List<Integer>
		BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);

		List<Integer> result3 = func3.apply(2, 3);

		System.out.println(result3);
		
	}

}
