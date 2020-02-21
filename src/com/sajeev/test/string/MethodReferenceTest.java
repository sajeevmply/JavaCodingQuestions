package com.sajeev.test.string;

import java.util.function.BiFunction;

public class MethodReferenceTest {

	public static int add(int a, int b){  
		return a+b;  
	} 
	
	public void saySomething(){  
		System.out.println("Hello,How Are You ???");
	} 
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder =  MethodReferenceTest::add;
		int result = adder.apply(10, 20);  
		System.out.println(result); 
	
		Sayable sayable2 = new MethodReferenceTest()::saySomething; // You can use anonymous object also  
        // Calling interface method  
        sayable2.say();   
		
	}
}
