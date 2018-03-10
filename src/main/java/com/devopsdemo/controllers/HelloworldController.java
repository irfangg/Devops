package com.devopsdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloworldController {

	@RequestMapping("/")
	public String sayHello() {
		System.out.println("inside sayHello");
		return "index";
	}
	
}
