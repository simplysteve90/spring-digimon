package it.dst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dst.model.Digimon;
import it.dst.repos.DigimonRepository;

@Service
@Transactional
public class DigimonService {
	
	@Autowired
	DigimonRepository repo;
	public Digimon save(Digimon digimon) {
		return repo.save(digimon);

	}
	public List<Digimon> listAll() {
		return (List<Digimon>) repo.findAll();
	}
	public Digimon get(Long id) {
		return repo.findById(id).get();
	}
	public void delete(Long id) {
		repo.deleteById(id);
	}
	

}
