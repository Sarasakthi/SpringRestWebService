package org.comit.Rest.user.controller;

import org.comit.Rest.user.bean.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
/*	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
		
	}*/
	
	@GetMapping
	public HelloWorldBean intro() {
		HelloWorldBean hello = new HelloWorldBean();
		hello.setMessage("Have a Great Day");
		return new HelloWorldBean(hello.getMessage(), "Saraswathi",1000);
	}
	
	@GetMapping("/{name}")
	public HelloWorldBean displayPathVariable(@PathVariable String name) {
		return new HelloWorldBean("Hi",String.format("%s",name),125);
		
	}

}
