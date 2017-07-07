package com.mvc.controller;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.model.People;

import org.springframework.ui.ModelMap;

@Controller

public class PeopleController {
	String[] name =new String[]{"AA","BB","CC"};
	String[] address =new String[]{"Thailand","Lao","Malaysia"};
	int[] id =new int[]{7749,7642,7535};
	
	@RequestMapping(value ="/formaddpeople")
	public ModelAndView people(){
		return new ModelAndView("formaddpeople","command",new People());
	}
	
	@RequestMapping(value ="/peopleview",method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("peopleview")People people,ModelMap model){
		model.addAttribute("Id",people.getId());
		model.addAttribute("name",people.getName());
		model.addAttribute("address",people.getAddress());
		return "peopleview";
	}
	
	@RequestMapping(value ="/listviewpeople")
	public ModelAndView setList(){
		ArrayList<People> peoples =new ArrayList();
		for(int i=0;i<name.length;i++){
			People people=new People();
			people.setId(id[i]);
			people.setName(name[i]);
			people.setAddress(address[i]);
			peoples.add(people);
		}
		
		return new ModelAndView("listviewpeople","peoples",peoples);
	}
}
