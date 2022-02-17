package com.hcl.bifunctionexamples;

@FunctionalInterface
public interface BiFunctionInterface<T, U, R> {

	R apply(T t, U u);

}
