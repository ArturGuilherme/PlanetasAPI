package br.com.arturguilherme.planeta.api.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.arturguilherme.planeta.api.entity.ClassePlanetaEntity;

public interface ClasseRepository extends CrudRepository<ClassePlanetaEntity,String> {

}
