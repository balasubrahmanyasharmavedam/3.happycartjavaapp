package com.subbu.happycart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[]args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		
		context.scan("com.subbu.happycart");
		context.refresh();
		context.getBean("category");
		System.out.println("done with java app using maven!");
	}

}