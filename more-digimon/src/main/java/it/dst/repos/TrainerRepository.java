package it.dst.repos;

import org.springframework.data.repository.CrudRepository;

import it.dst.model.Trainer;

public interface TrainerRepository extends CrudRepository<Trainer, String> {

}
