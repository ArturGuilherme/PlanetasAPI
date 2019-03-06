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

	/*
	@Query(value = "select * from planeta where id_classe = :id_classe", nativeQuery = true)
	Iterable<PlanetaEntity> findAllClasse(@Param("id_classe") String id_classe);
	
	@Query(value = "select * from planeta where id_tipo_atmosfera = :id_tipo", nativeQuery = true)
	Iterable<PlanetaEntity> findAllAtmofera(@Param("id_tipo") Integer id_tipo);
	
	@Query(value = "select * from planeta where id_quadrante = :id_quadrante", nativeQuery = true)
	Iterable<PlanetaEntity> findAllQuadrante(@Param("id_quadrante") Integer id_quadrante);
	
	@Query(value = "select * from planeta where data_descobrimento between :dataInicio and :dataFim", nativeQuery = true)
	Iterable<PlanetaEntity> findAllData(@Param("dataInicio") Date dataInicio,@Param("dataFim") Date dataFim);
	
	@Query(value = "select * from planeta where massa > :massa", nativeQuery = true)
	Iterable<PlanetaEntity> findAllMassa(@Param("massa") Integer massa);
	
	@Query(value = "select * from planeta where diametro between :minimo and :maximo", nativeQuery = true)
	Iterable<PlanetaEntity> findAllDiametro(@Param("minimo") Integer minimo,@Param("maximo") Integer maximo);*/
	
	
	public List<PlanetaEntity> findByPlaneta_colonizado(boolean planeta_colonizado);
	
	public List<PlanetaEntity> findById_quadrante(QuadranteEstelarEntity quadranteEstelarEntity);
	
	public List<PlanetaEntity> findById_classe(ClassePlanetaEntity classePlanetaEntity);
	
	public List<PlanetaEntity> findById_tipo_atmosfera(TipoAtmosferaEntity tipoAtmosferaEntity );
	
	public List<PlanetaEntity> findByMassaGreaterThan(int massa);
	
	public List<PlanetaEntity> findByData_descobrimentoBetween(Date data_incial,Date data_final);
	
	public List<PlanetaEntity> findByDiametroBetween(int diametro_inicial,int diametro_final);
	
	public List<PlanetaEntity> findByNome(String nome);
	

}
