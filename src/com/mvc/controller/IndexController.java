package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
//	@RequestMapping(value="/index", method =RequestMethod.GET)
//	public String index(){
//		return "index";
//	}
	@RequestMapping(value ="/hello")
	public ModelAndView helloName(){
		return new ModelAndView("hello","message","Hello Worlds");
	}
}
