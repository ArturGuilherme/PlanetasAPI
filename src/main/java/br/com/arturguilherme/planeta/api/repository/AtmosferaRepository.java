package br.com.arturguilherme.planeta.api.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.arturguilherme.planeta.api.entity.TipoAtmosferaEntity;

public interface AtmosferaRepository extends CrudRepository<TipoAtmosferaEntity,Integer> {

}
