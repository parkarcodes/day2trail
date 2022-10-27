package com.nau.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
public class CalculatorController {

	
	private CalculatorService calculatorService;

	@GetMapping
	@RequestMapping("add/{num}")
	public String add(@PathVariable("num") Integer num) {
		calculatorService.add(num);
		return "ok";

	}

	@GetMapping
	@RequestMapping("sub/{num}")
	public String sub(@PathVariable("num") Integer num) {
		calculatorService.sub(num);
		return "ok";
	}

	@GetMapping
	@RequestMapping("result")
	public String result() {
		return "REsult is : " + calculatorService.result();
	}

}
