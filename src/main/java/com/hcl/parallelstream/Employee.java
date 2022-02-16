package com.hcl.parallelstream;

import java.io.Serializable;
import java.math.BigDecimal;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

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
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String name;
    private int age;
    private BigDecimal salary;

    //getters, setters n etc...

}
