package com.org.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	
	@RequestMapping("/src/sample") //It Map
	public SampleResponse Sample(@RequestParam(value = "name" , defaultValue = " RestFul WebService ")String name) {
		SampleResponse res = new SampleResponse();
		res.setId(105);
		res.setName("Your Service is : "+name);
		return res;
	}
	
	@RequestMapping("/goodpage")
	public String goodPage() {
		String s = " This Is My RestFul Service And Here We Are Using HTTP Method --> For Request Response ";
		return s;
	}
}
