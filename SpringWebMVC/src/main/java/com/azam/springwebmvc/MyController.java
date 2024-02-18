package com.azam.springwebmvc;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Component
public class MyController {
	@RequestMapping("/link1")
	public String m1() {
		return "rspn1.jsp";
	}
	
	@RequestMapping("/link2")
	public String m2() {
		return "rspn2.jsp";
	}
}
