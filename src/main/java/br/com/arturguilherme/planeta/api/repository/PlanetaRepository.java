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

	public List<PlanetaEntity> findByPlanetaColonizado(boolean planeta_colonizado);
	
	public List<PlanetaEntity> findByQuadranteEstelarEntity(QuadranteEstelarEntity quadranteEstelarEntity);
	
	public List<PlanetaEntity> findByClassePlanetaEntity(ClassePlanetaEntity classePlanetaEntity);
	
	public List<PlanetaEntity> findByTipoAtmosferaEntity(TipoAtmosferaEntity tipoAtmosferaEntity );
	
	public List<PlanetaEntity> findByMassaGreaterThan(int massa);
	
	public List<PlanetaEntity> findByDataDescobrimentoBetween(Date data_incial,Date data_final);
	
	public List<PlanetaEntity> findByDiametroBetween(int diametro_inicial,int diametro_final);
	
	public List<PlanetaEntity> findByNome(String nome);
	

}
