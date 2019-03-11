package br.com.arturguilherme.planeta.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.arturguilherme.planeta.api.entity.ClassePlanetaEntity;

public interface ClasseRepository extends CrudRepository<ClassePlanetaEntity,String> {

	public Optional<ClassePlanetaEntity> findByIdClasse(String idCodigo);
	
}
