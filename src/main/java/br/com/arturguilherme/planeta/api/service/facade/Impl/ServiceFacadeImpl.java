package br.com.arturguilherme.planeta.api.service.facade.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.entity.PlanetaEntity;
import br.com.arturguilherme.planeta.api.service.PlanetaService;
import br.com.arturguilherme.planeta.api.service.facade.ServiceFacade;

@Service
@Transactional(rollbackFor = Exception.class)
public class ServiceFacadeImpl implements ServiceFacade {

	@Autowired
	private PlanetaService planetaService;

	@Override
	public List<PlanetaEntity> listarTodosPlanetas() throws Exception {
		
		 return planetaService.listarTodosPlanetas();

	}

	@Override
	public PlanetaEntity listarPlanetaId(Integer id) throws Exception {
		
		return planetaService.listarPlanetaId(id);
	}

	@Override
	public List<PlanetaEntity> listarPlanetasClasse(String classeID) throws Exception {
		
		return planetaService.listarPlanetasClasse(classeID);
		
	}

	@Override
	public List<PlanetaEntity> listarPlanetasAtmosfera(Integer ID) throws Exception {
		
		return planetaService.listarPlanetasAtmosfera(ID);
	
	}

	@Override
	public List<PlanetaEntity> listarPlanetasHabitaveis() throws Exception {
		
		return null;
	}

	@Override
	public List<PlanetaEntity> listarPlanetasData(Date dataInicio, Date dataFim) throws Exception {
		
		return planetaService.listarPlanetasData(dataInicio, dataFim);
	}

	@Override
	public List<PlanetaEntity> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception {
		
		return planetaService.listarPlanetasMaiorMassa(massaMinima);
	
	}

	@Override
	public List<PlanetaEntity> listarPlanetasDiametro(Integer minima, Integer maxima) throws Exception {
		
		
		return planetaService.listarPlanetasDiametro(minima, maxima);
	
	}
	
	@Override
	public List<PlanetaEntity> listarPlanetasQuadrante(Integer id) throws Exception {
		
		return planetaService.listarPlanetasQuadrante(id);
	
	}


	@Override
	public int incluirPlaneta(PlanetaDTO planetaDTO) throws Exception {
		
		return planetaService.incluirPlaneta(planetaDTO);
	
	}

	@Override
	public void excluirPlaneta(Integer id) throws Exception {
	
		planetaService.excluirPlaneta(id);
	
	}

}
