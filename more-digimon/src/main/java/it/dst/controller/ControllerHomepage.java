package it.dst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerHomepage {
	
	@RequestMapping("/")
	public ModelAndView homepage(){
		ModelAndView model = new ModelAndView("homepage");
		return model;
	}

}
