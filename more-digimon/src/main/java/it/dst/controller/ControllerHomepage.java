package it.dst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import it.dst.model.Digimon;
import it.dst.model.Trainer;
import it.dst.service.DigimonService;
import it.dst.service.TrainerService;

@Controller
public class ControllerHomepage {
	@Autowired
	private TrainerService trainerService;
	@Autowired
	private DigimonService digimonService;
	
	@RequestMapping("/")
	public ModelAndView homepage(){
		List<Trainer>trainerList= trainerService.listAll();
		List<Digimon>digimonList= digimonService.listAll();
		ModelAndView model = new ModelAndView("homepage");
		model.addObject("trainerList", trainerList);
		model.addObject("digimonList", digimonList);
		return model;
	}

}
