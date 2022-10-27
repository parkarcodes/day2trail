package com.nau.bean;

import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service
//@Scope("prototype")
public class CalculatorServiceImpl implements CalculatorService {
	
	public CalculatorServiceImpl() {
System.out.println("Calculator Obejct");
	}
	
	private int total=0;

	public int add(int i) {  //  add(1) /  add(4) / div(2)
		return this.total = this.total + i;
	}

	public int div(int i) {
		return this.total = this.total / i;
	}

	public int sub(int i) {
		return this.total = this.total - i;
	}

	public int mul(int i) {
		return this.total = this.total * i;
	}

	public int result() {
		return total;
	}
	
	
	

}
