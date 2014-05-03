package com.codinko.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"context.xml");
		MyService service = (MyService) context.getBean("myservice");
		service.hello();
	}
}
