package it.dst.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.dst.model.Trainer;
import it.dst.service.TrainerService;

@Controller
public class ControllerTrainer {
	@Autowired
	TrainerService trainerService;
	@RequestMapping("/newTrainer")
	public String newTrainer(Map<String, Object> model) {
		Trainer trainer = new Trainer();
		model.put("trainer", trainer);
		return "new_trainer";
	}
	@RequestMapping(value = "/saveTrainer", method = RequestMethod.POST)
	public String saveTrainer(@ModelAttribute("trainer") Trainer trainer) {
		trainerService.save(trainer);
		return "redirect:/";
	}
	@RequestMapping("/deleteTrainer")
	public String deleteProductForm(@RequestParam String name) {
		trainerService.delete(name);
		return "redirect:/";		
	}

}