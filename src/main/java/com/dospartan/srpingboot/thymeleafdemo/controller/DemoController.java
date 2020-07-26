package com.dospartan.srpingboot.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dospartan.srpingboot.thymeleafdemo.entity.Employee;

@Controller
public class DemoController {
	
	@GetMapping("/hello")
	public String sayHello(Model theModel) {
		theModel.addAttribute("theDate", new java.util.Date());
		
		return "helloworld";
	}

}
