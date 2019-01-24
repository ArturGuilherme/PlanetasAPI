package br.com.arturguilherme.planeta.api.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.arturguilherme.planeta.api.entity.PlanetaEntity;

public interface PlanetaRepository extends CrudRepository<PlanetaEntity, Integer>{

	@Query(value = "select * from planeta where id_classe = :id_classe", nativeQuery = true)
	Iterable<PlanetaEntity> findAllClasse(@Param("id_classe") String id_classe);
	
}
