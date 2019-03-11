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
	
	//Conversão do Entity para DTO
	private PlanetaEntity convertToEntity(PlanetaDTO planetaDTO) {
				PlanetaEntity planetaEntity = modelMapper.map(planetaDTO, PlanetaEntity.class);
			    return planetaEntity;
	}



	@Override
	public List<PlanetaDTO> listarTodosPlanetas() throws Exception {
		
		List<PlanetaEntity> planetas = planetaService.listarTodosPlanetas();
		
		return planetas.stream().map(planetaEntity -> convertToDto(planetaEntity)).collect(Collectors.toList());
		
	}

	@Override
	public List<PlanetaDTO> listarPlanetasClasse(String classeID) throws Exception {
		
		List<PlanetaEntity> planetas =  planetaService.listarPlanetasClasse(classeID);
		
		return planetas.stream().map(planetaEntity -> convertToDto(planetaEntity)).collect(Collectors.toList());
		
	}

	@Override
	public List<PlanetaDTO> listarPlanetasAtmosfera(Integer ID) throws Exception {
		
		List<PlanetaEntity> planetas = planetaService.listarPlanetasAtmosfera(ID);
	
		return planetas.stream().map(planetaEntity -> convertToDto(planetaEntity)).collect(Collectors.toList());
	
	}

	@Override
	public List<PlanetaDTO> listarPlanetasHabitaveis() throws Exception {
		
		return null;
	}

	@Override
	public List<PlanetaDTO> listarPlanetasData(Date dataInicio, Date dataFim) throws Exception {
		
		List<PlanetaEntity> planetas =  planetaService.listarPlanetasData(dataInicio, dataFim);
		
		return planetas.stream().map(planetaEntity -> convertToDto(planetaEntity)).collect(Collectors.toList());
		
	}

	@Override
	public List<PlanetaDTO> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception {
		
		List<PlanetaEntity> planetas =  planetaService.listarPlanetasMaiorMassa(massaMinima);
		
		return planetas.stream().map(planetaEntity -> convertToDto(planetaEntity)).collect(Collectors.toList());
	
	}

	@Override
	public List<PlanetaDTO> listarPlanetasDiametro(Integer minima, Integer maxima) throws Exception {
		
		
		List<PlanetaEntity> planetas = planetaService.listarPlanetasDiametro(minima, maxima);
		
		return planetas.stream().map(planetaEntity -> convertToDto(planetaEntity)).collect(Collectors.toList());
	
	}
	
	@Override
	public List<PlanetaDTO> listarPlanetasQuadrante(Integer id) throws Exception {
		
		List<PlanetaEntity> planetas = planetaService.listarPlanetasQuadrante(id);
		
		return planetas.stream().map(planetaEntity -> convertToDto(planetaEntity)).collect(Collectors.toList());
	
	}


	@Override
	public int incluirPlaneta(PlanetaDTO planetaDTO) throws Exception {
		
		PlanetaEntity planetaEntity = convertToEntity(planetaDTO);
		
		return planetaService.incluirPlaneta(planetaEntity);
	
	}

	@Override
	public void excluirPlaneta(Integer id) throws Exception {
	
		planetaService.excluirPlaneta(id);
	
	}

}
