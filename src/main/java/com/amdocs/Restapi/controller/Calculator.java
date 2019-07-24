package com.amdocs.Restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
	@GetMapping("addition")
	@ResponseBody
	public double addition(@RequestParam double firstOperand,@RequestParam double secondOperand) {
		return firstOperand+secondOperand;
	}
	
	@GetMapping("test")
	@ResponseBody
	public String test() {
		return "<h1> Hello </h1> ";
	}
}
