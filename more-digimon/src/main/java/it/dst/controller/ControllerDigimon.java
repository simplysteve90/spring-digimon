package it.dst.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.dst.model.Digimon;
import it.dst.service.DigimonService;

@Controller
public class ControllerDigimon {
	@Autowired
	DigimonService digimonService;

	@RequestMapping("/newDigimon")
	public String newDigimon(Map<String, Object> model) {
		Digimon digimon = new Digimon();
		model.put("digimon", digimon);
		return "new_digimon";
	}

	@RequestMapping(value = "/saveDigimon", method = RequestMethod.POST)
	public String saveDigimon(@ModelAttribute("digimon") Digimon digimon) {
		digimonService.save(digimon);
		return "redirect:/";
	}

	@RequestMapping("/deleteDigimon")
	public String deleteProductForm(@RequestParam long id) {
		digimonService.delete(id);
		return "redirect:/";
	}

	@RequestMapping("/editDigimon")
	public ModelAndView editDigimon(@RequestParam long id) {
		ModelAndView mav = new ModelAndView("edit_digimon");
	Digimon digimon = digimonService.get(id);
		mav.addObject("digimon", digimon);
		
		return mav;
	}

}
