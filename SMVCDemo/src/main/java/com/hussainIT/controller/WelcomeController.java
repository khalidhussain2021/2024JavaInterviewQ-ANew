package com.hussainIT.controller;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class WelcomeController {

	@GetMapping("/hello")
	public ModelAndView dispaly() {
		ModelAndView andView=new ModelAndView();
		andView.addObject("msg","Welcome to spring Mvc");
		andView.setViewName("index");
		return andView;
	}
	
	@GetMapping("/great")
   public ModelAndView dispalyGreat() {
		ModelAndView view=new ModelAndView();
		view.addObject("msg","Good Moring ----");
		view.setViewName("index");
	   return view;
   }
	
	@RequestMapping(value ="/dat", method = RequestMethod.GET)
	public ModelAndView getTodayDate() {
		ModelAndView view=new ModelAndView();
		Date dl=new Date();
		LocalDate dd=LocalDate.now();
		view.addObject("msg", " Today date is : "+dl);
		view.addObject("msg","Today Only date : "+dd);
		view.setViewName("index");
		return view;
	}
}
