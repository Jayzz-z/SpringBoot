package com.org.postdemo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@RequestMapping(value = "/test", method = RequestMethod.POST)
	public PostResponse Test(@RequestBody PostRequest inputload) {
		PostResponse res = new PostResponse();
		res.setId(inputload.getId());
		res.setMessage("Hello, How are you "+inputload.getName());
		res.setRef("Taking  ref from some friends");
		return res;
	}
	
}
