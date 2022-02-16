package com.hcl.lambdaexpressionexample4;

interface Sayable{  
    public String say(String name);  
}  
  
public class LambdaExpressionExample4{  
    public static void main(String[] args) {  
      
        // Lambda expression with single parameter.  
        Sayable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("ALex"));  
          
        // You can omit function parentheses    
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Jason"));  
    }  
}  
