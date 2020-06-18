package it.dst.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
	@Id
	private String name;
	@OneToMany
	private List<Digimon> digiList;

	public Trainer() {
	}

	public Trainer(String name, List<Digimon> digiList) {
		this.name = name;
		this.digiList = new ArrayList<Digimon>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Digimon> getDigiList() {
		return digiList;
	}

	public void setDigiList(List<Digimon> digiList) {
		this.digiList = digiList;
	}

}
