package com.nau.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component // bread
public class A {

	@Autowired
	private B b ; /// cheese
	
	public A() {
		System.out.println("A obejct is created");
	}
	
}
