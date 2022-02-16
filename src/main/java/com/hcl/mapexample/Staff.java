package com.hcl.mapexample;

import java.math.BigDecimal;

public class Staff {

	private String name;
	private int age;

	private float salary;

	public Staff(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Staff(String string, int i, BigDecimal bigDecimal) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}