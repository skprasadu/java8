package com.hcl.lambdaexpressionexample7;

import java.util.*;  
public class LambdaExpressionExample7{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Alliena");  
        list.add("Alex");  
        list.add("Etka");  
        list.add("Justin");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  
