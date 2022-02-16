package com.hcl.filter;

public class Person {
	
	private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString(){//overriding the toString() method  
  	  return name+" "+age;  
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

	
    
    

    //gettersm setters, toString
}
