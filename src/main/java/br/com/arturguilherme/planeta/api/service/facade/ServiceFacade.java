package br.com.arturguilherme.planeta.api.service.facade;

import java.util.Date;
import java.util.List;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.entity.PlanetaEntity;

public interface ServiceFacade {
	
	public List<PlanetaEntity> listarTodosPlanetas() throws Exception;
	
	public PlanetaEntity listarPlanetaId(Integer id)  throws Exception;
	
	public List<PlanetaEntity> listarPlanetasQuadrante(Integer id)  throws Exception;
	
	public List<PlanetaEntity> listarPlanetasClasse(String classeID) throws Exception;
	
	public List<PlanetaEntity> listarPlanetasAtmosfera(Integer ID) throws Exception;
	
	public List<PlanetaEntity> listarPlanetasHabitaveis() throws Exception;
	
	public List<PlanetaEntity> listarPlanetasData(Date dataInicio,Date dataFim) throws Exception;
	
	public List<PlanetaEntity> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception;
	
	public List<PlanetaEntity> listarPlanetasDiametro(Integer minima,Integer maxima) throws Exception;
	
	public int incluirPlaneta(PlanetaDTO planetaDTO) throws Exception;
	
	public void excluirPlaneta(Integer id) throws Exception;
	
}
