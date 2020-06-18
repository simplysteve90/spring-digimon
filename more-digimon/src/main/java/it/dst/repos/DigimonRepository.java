package it.dst.repos;

import org.springframework.data.repository.CrudRepository;


import it.dst.model.Digimon;

public interface DigimonRepository extends CrudRepository<Digimon, Long> {

}
