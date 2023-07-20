package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class myController {

	@RequestMapping(value="/about",method = RequestMethod.GET)
	public String about(Model model) {
		
		//putting data in model
		model.addAttribute("name","javid iqbal");
		model.addAttribute("currDate",new Date().toString());
		//return html.about
		return "about";
	}
	
	//handling iteration
	@GetMapping("/loop")
	public String iteration(Model model) {
		List<String>list=List.of("javid","xaheer","maisum");
		model.addAttribute("names",list);
		return "iterate";
	}
	
	//handling conditional statement
	@GetMapping("/condition")
	public String conditionHandler(Model m) {
		m.addAttribute("isActive",true);
		m.addAttribute("gender","f");
		
		List<Integer>list=List.of(1,2,3,4);
		m.addAttribute("mylist",list);
		return "condition";
	}
	
	//handling footers
	@GetMapping("/service")
	public String footerHandler(Model m) {
		m.addAttribute("title","this is title");
		m.addAttribute("subtitle","this is subtitle");
		return "service";
	}
}
