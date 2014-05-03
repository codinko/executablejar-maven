package com.codinko.example;

import org.springframework.stereotype.Service;

@Service("myservice")
public class MyService {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void hello() {
		System.out.format("%s says hello", name);
	}

}
