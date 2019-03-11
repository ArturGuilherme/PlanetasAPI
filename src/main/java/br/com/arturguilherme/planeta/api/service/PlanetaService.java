package br.com.arturguilherme.planeta.api.service;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.entity.PlanetaEntity;

import java.util.Date;
import java.util.List;

public interface PlanetaService {

	public List<PlanetaEntity> listarTodosPlanetas() throws Exception;
	
	public List<PlanetaEntity> listarPlanetasClasse(String classeID) throws Exception;
	
	public List<PlanetaEntity> listarPlanetasQuadrante(Integer quadranteId) throws Exception;
	
	public List<PlanetaEntity> listarPlanetasAtmosfera(Integer ID) throws Exception;
	
	public List<PlanetaEntity> listarPlanetasData(Date dataInicio,Date dataFim) throws Exception;
	
	public List<PlanetaEntity> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception;
	
	public List<PlanetaEntity> listarPlanetasDiametro(Integer minima,Integer maxima) throws Exception;
	
	public int incluirPlaneta(PlanetaEntity planetaEntity) throws Exception;
	
	public void excluirPlaneta(Integer id) throws Exception;	



}
