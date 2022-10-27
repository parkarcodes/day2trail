package com.nau;

import javax.annotation.PreDestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class CalculatorserviceApplication {

	public static void main(String[] args) {
 //
		AbstractApplicationContext ctx = 	(AbstractApplicationContext) SpringApplication.run(CalculatorserviceApplication.class, args);
		ctx.registerShutdownHook();
		System.out.println("ok");
		// aaa
		//		MYBean mb = ctx.getBean(MYBean.class);
//		mb.hello("naushad");
//		ctx.getBean(ModelMapper.class);
//		ctx.getBean(A.class);
		System.out.println("");
		
	}
	
	@PreDestroy
	public void killed() {
		System.out.println("killed");
	}
}
