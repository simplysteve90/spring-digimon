package it.dst.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Digimon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	private String name;
	private Long hp;
	private Long atk;
	private Long def;
	private Long res;
	private String evolution;
	
	public Digimon(Long id, String name, Long hp, Long atk, Long def, Long res, String evolution, List<Trainer> lista) {
		super();
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.res = res;
		this.evolution = evolution;
	}



	public Digimon() {
		
	}

	public Digimon(Long id, String name, Long hp, Long atk, Long def, Long res, String evolution) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.res = res;
		this.evolution = evolution;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getHp() {
		return hp;
	}

	public void setHp(Long hp) {
		this.hp = hp;
	}

	public Long getAtk() {
		return atk;
	}

	public void setAtk(Long atk) {
		this.atk = atk;
	}

	public Long getDef() {
		return def;
	}

	public void setDef(Long def) {
		this.def = def;
	}

	public Long getRes() {
		return res;
	}

	public void setRes(Long res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "Digimon [id=" + id + ", name=" + name + ", hp=" + hp + ", atk=" + atk + ", def=" + def + ", res=" + res
				+ ", evolution=" + evolution + "]";
	}

	public String getEvolution() {
		return evolution;
	}

	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	

}
