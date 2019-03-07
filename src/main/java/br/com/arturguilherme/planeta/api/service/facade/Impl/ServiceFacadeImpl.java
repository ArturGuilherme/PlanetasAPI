package br.com.arturguilherme.planeta.api.service.facade.Impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;

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
	
	@Autowired
	private ModelMapper modelMapper;
	
	//Conversão do Entity para DTO
	private PlanetaDTO convertToDto(PlanetaEntity planetaEntity) {
		PlanetaDTO planetaDTO = modelMapper.map(planetaEntity, PlanetaDTO.class);
	    return planetaDTO;
	}


	@Override
	public List<PlanetaDTO> listarTodosPlanetas() throws Exception {
		
		List<PlanetaEntity> planetas = planetaService.listarTodosPlanetas();
		
		return planetas.stream().map(planetaEntity -> convertToDto(planetaEntity)).collect(Collectors.toList());
		
	}

	@Override
	public PlanetaDTO listarPlanetaId(Integer id) throws Exception {
		
		return planetaService.listarPlanetaId(id);
	}

	@Override
	public List<PlanetaDTO> listarPlanetasClasse(String classeID) throws Exception {
		
		return planetaService.listarPlanetasClasse(classeID);
		
	}

	@Override
	public List<PlanetaDTO> listarPlanetasAtmosfera(Integer ID) throws Exception {
		
		return planetaService.listarPlanetasAtmosfera(ID);
	
	}

	@Override
	public List<PlanetaDTO> listarPlanetasHabitaveis() throws Exception {
		
		return null;
	}

	@Override
	public List<PlanetaDTO> listarPlanetasData(Date dataInicio, Date dataFim) throws Exception {
		
		return planetaService.listarPlanetasData(dataInicio, dataFim);
	}

	@Override
	public List<PlanetaDTO> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception {
		
		return planetaService.listarPlanetasMaiorMassa(massaMinima);
	
	}

	@Override
	public List<PlanetaDTO> listarPlanetasDiametro(Integer minima, Integer maxima) throws Exception {
		
		
		return planetaService.listarPlanetasDiametro(minima, maxima);
	
	}
	
	@Override
	public List<PlanetaDTO> listarPlanetasQuadrante(Integer id) throws Exception {
		
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
