package br.com.arturguilherme.planeta.api.service.facade;

import java.util.Date;
import java.util.List;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;

public interface ServiceFacade {
	
	public List<PlanetaDTO> listarTodosPlanetas() throws Exception;
	
	public PlanetaDTO listarPlanetaId(Integer id)  throws Exception;
	
	public List<PlanetaDTO> listarPlanetasQuadrante(Integer id)  throws Exception;
	
	public List<PlanetaDTO> listarPlanetasClasse(String classeID) throws Exception;
	
	public List<PlanetaDTO> listarPlanetasAtmosfera(Integer ID) throws Exception;
	
	public List<PlanetaDTO> listarPlanetasHabitaveis() throws Exception;
	
	public List<PlanetaDTO> listarPlanetasData(Date dataInicio,Date dataFim) throws Exception;
	
	public List<PlanetaDTO> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception;
	
	public List<PlanetaDTO> listarPlanetasDiametro(Integer minima,Integer maxima) throws Exception;
	
	public int incluirPlaneta(PlanetaDTO planetaDTO) throws Exception;
	
	public List<PlanetaDTO> atualizarPlaneta(PlanetaDTO planetaDTO) throws Exception;
	
	public void excluirPlaneta(Integer id) throws Exception;
	
}
