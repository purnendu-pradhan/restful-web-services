package com.in28minuites.rest.webservices.restfulwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;

	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello";
	}
	
	@GetMapping("/hello-world-bean")
	public HellWorldBean helloWorldBean() {
		return new HellWorldBean("hello world");
	}
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HellWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HellWorldBean(String.format("Hello World, %s", name));
	}
	@GetMapping("/hello-world-internationalized")
	public String helloWorldInternationalized() {
		return messageSource.getMessage("good.morning.message", null, "Default message",
				LocaleContextHolder.getLocale());
	}
}
