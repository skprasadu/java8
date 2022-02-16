package com.hcl.lambdacomprator;
import java.util.ArrayList;  
import java.util.List;  
import java.util.stream.Stream;   

class Product1{  
    int id;  
    String name;  
    float price;  
    public Product1(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class LambdaExpressionExample11{  
    public static void main(String[] args) {  
        List<Product1> list=new ArrayList<Product1>();  
        list.add(new Product1(1,"Samsung A5",17000f));  
        list.add(new Product1(3,"Iphone 6S",65000f));  
        list.add(new Product1(2,"Sony Xperia",25000f));  
        list.add(new Product1(4,"Nokia Lumia",15000f));  
        list.add(new Product1(5,"Redmi4 ",26000f));  
        list.add(new Product1(6,"Lenevo Vibe",19000f));  
          
        // using lambda to filter data  
        Stream<Product1> filtered_data = list.stream().filter(p -> p.price >= 15000);  
          
        // using lambda to iterate through collection  
        filtered_data.forEach(  
                Product1 -> System.out.println(Product1.name+": "+Product1.price)  
        );  
    }  
}  
