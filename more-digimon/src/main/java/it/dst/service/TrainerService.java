package it.dst.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dst.model.Trainer;
import it.dst.repos.TrainerRepository;

@Service
@Transactional
public class TrainerService {
	@Autowired
	TrainerRepository rep;

	public  void save(Trainer trainer) {
		rep.save(trainer);

	}
	public List<Trainer> listAll() {
		return (List<Trainer>) rep.findAll();
	}
	public Trainer get(Long id) {
		return rep.findById(id).get();
	}
	public void delete(Long id) {
		rep.deleteById(id);
	}
}