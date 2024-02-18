package com.azam.springWebMaven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
		@RequestMapping("/link1")
		public String m1() {
			return "rspn1.jsp";
			
		}
		@RequestMapping
		public String m2() {
			return "rspn2.jsp";
			
		}
	}

}
