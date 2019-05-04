package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloworldController {
	@RequestMapping("/hello")
	@ResponseBody
	public String helloWorld(){
		
		return "hello world";
	}
}
