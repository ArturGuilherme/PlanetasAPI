package br.com.arturguilherme.planeta.api.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.arturguilherme.planeta.api.entity.QuadranteEstelarEntity;

public interface QuadranteRepository extends CrudRepository<QuadranteEstelarEntity,Integer> {

}
