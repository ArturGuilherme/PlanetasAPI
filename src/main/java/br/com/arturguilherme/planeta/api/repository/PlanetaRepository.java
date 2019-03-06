package br.com.arturguilherme.planeta.api.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.arturguilherme.planeta.api.entity.ClassePlanetaEntity;
import br.com.arturguilherme.planeta.api.entity.PlanetaEntity;
import br.com.arturguilherme.planeta.api.entity.QuadranteEstelarEntity;
import br.com.arturguilherme.planeta.api.entity.TipoAtmosferaEntity;

public interface PlanetaRepository extends CrudRepository<PlanetaEntity, Integer>{

	public List<PlanetaEntity> findByPlaneta_colonizado(boolean planeta_colonizado);
	
	public List<PlanetaEntity> findById_quadrante(QuadranteEstelarEntity quadranteEstelarEntity);
	
	public List<PlanetaEntity> findById_classe(ClassePlanetaEntity classePlanetaEntity);
	
	public List<PlanetaEntity> findById_tipo_atmosfera(TipoAtmosferaEntity tipoAtmosferaEntity );
	
	public List<PlanetaEntity> findByMassaGreaterThan(int massa);
	
	public List<PlanetaEntity> findByData_descobrimentoBetween(Date data_incial,Date data_final);
	
	public List<PlanetaEntity> findByDiametroBetween(int diametro_inicial,int diametro_final);
	
	public List<PlanetaEntity> findByNome(String nome);
	

}
