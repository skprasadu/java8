package com.hcl.collectors;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsExample {
    /* Driver Code */
    public static void main(String args[]) {
        List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array  
        String str = liststr
        		.stream()
        		.collect(Collectors.joining(", ")); //performs joining operation
        
        System.out.println(str.toString());  //Displays result  
        
        List<String> liststr1 = Arrays.asList("abc", "pqr", "xyz", "xyz", "pqr", "dog"); //List of String array  
        
        //Boring way
        Set<String> set = new HashSet<>();
        
        for(String s: liststr1) {
        	set.add(s);
        	
        }
        System.out.println(set);
        
        //Example to convert List to a Set
        Set<String> set1 = liststr1
        		.stream()
        		.collect(Collectors.toSet()); //performs joining operation
        
        System.out.println(set1);  //Displays result  
    }
}  