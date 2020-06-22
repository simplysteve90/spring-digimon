package it.dst.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	private String name;
	@OneToMany
	private List<Digimon> digiList;

	public Trainer(Long id, String name, List<Digimon> digiList) {
		super();
		this.id = id;
		this.name = name;
		this.digiList = new ArrayList<Digimon>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
