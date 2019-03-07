package br.com.arturguilherme.planeta.api.service.impl;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.entity.ClassePlanetaEntity;
import br.com.arturguilherme.planeta.api.entity.PlanetaEntity;
import br.com.arturguilherme.planeta.api.entity.TipoAtmosferaEntity;
import br.com.arturguilherme.planeta.api.exception.PlanetaNaoEncontradoException;
import br.com.arturguilherme.planeta.api.repository.AtmosferaRepository;
import br.com.arturguilherme.planeta.api.repository.ClasseRepository;
import br.com.arturguilherme.planeta.api.repository.PlanetaRepository;
import br.com.arturguilherme.planeta.api.repository.QuadranteRepository;
import br.com.arturguilherme.planeta.api.service.PlanetaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PlanetaServiceImpl implements PlanetaService {

	@Autowired
	private PlanetaRepository planetaRepository;
	private ClasseRepository classeRepository;
	private QuadranteRepository quadranteRepository;
	private AtmosferaRepository atmosferaRepository;
	@TESTE@
	
	// Listagem de todos os planetas
	@Override
	public List<PlanetaEntity> listarTodosPlanetas() throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findAll();

		iterable.iterator().forEachRemaining(planetas::add);
		
		return planetas;

	}

	// Listagem de apenas um planeta por ID
	@Override
	public PlanetaEntity listarPlanetaId(Integer id) throws Exception {
		
		PlanetaEntity planeta = new PlanetaEntity();

		Optional<PlanetaEntity> planetaEntity = planetaRepository.findById(id);
		
		planetaEntity

		return planetaEntity;

	}

	// Listagem dos planetas por classe
	@Override
	public List<PlanetaEntity> listarPlanetasClasse(String classeID) throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();
		
		Optional<ClassePlanetaEntity> optional_classe = classeRepository.findById(classeID);

		Iterable<PlanetaEntity> iterable = planetaRepository.findById_classe(optional_classe.get());

		iterable.iterator().forEachRemaining(planetas::add);
		
		return planetas;

	}

	// Lista de planetas por atmosfera
	@Override
	public List<PlanetaEntity> listarPlanetasAtmosfera(Integer ID) throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();
		
		Optional<TipoAtmosferaEntity> optional_atmosfera = atmosferaRepository.findById(ID);

		Iterable<PlanetaEntity> iterable = planetaRepository.findById_tipo_atmosfera(optional_atmosfera.get());

		iterable.iterator().forEachRemaining(planetas::add);
		
		return planetas;

	}

	// listagem dos planetas por um intervalo de data
	@Override
	public List<PlanetaEntity> listarPlanetasData(Date dataInicio, Date dataFim) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findByData_descobrimentoBetween(dataInicio, dataFim);

		iterable.forEach(planetaEntity -> {

			PlanetaDTO planetaDTO = new PlanetaDTO();

			planetaDTO.setId(planetaEntity.getIdPlaneta());
			planetaDTO.setClasse(planetaEntity.getClassePlaneta().getIdClasse());
			planetaDTO.setColonizado(planetaEntity.getPlanetaColonizado());
			planetaDTO.setData(planetaEntity.getDataDescobrimento());
			planetaDTO.setDiametro(planetaEntity.getDiametro());
			planetaDTO.setNome(planetaEntity.getNome());
			planetaDTO.setQuadrante(planetaEntity.getQuadranteEstelar().getIdQuadrante());
			planetaDTO.setTipoAtmo(planetaEntity.getTipoAtmosfera().getIdTipoAtmosfera());

			planetas.add(planetaDTO);
		});

		return planetas;

	}

	// listagem dos planetas por massa minima
	@Override
	public List<PlanetaEntity> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findByMassaGreaterThan(massaMinima);

		iterable.forEach(planetaEntity -> {

			PlanetaDTO planetaDTO = new PlanetaDTO();

			planetaDTO.setId(planetaEntity.getIdPlaneta());
			planetaDTO.setClasse(planetaEntity.getClassePlaneta().getIdClasse());
			planetaDTO.setColonizado(planetaEntity.getPlanetaColonizado());
			planetaDTO.setData(planetaEntity.getDataDescobrimento());
			planetaDTO.setDiametro(planetaEntity.getDiametro());
			planetaDTO.setNome(planetaEntity.getNome());
			planetaDTO.setQuadrante(planetaEntity.getQuadranteEstelar().getIdQuadrante());
			planetaDTO.setTipoAtmo(planetaEntity.getTipoAtmosfera().getIdTipoAtmosfera());

			planetas.add(planetaDTO);
		});

		return planetas;

	}

	// listagem dis planetas por intervalo de diametro
	@Override
	public List<PlanetaEntity> listarPlanetasDiametro(Integer minima, Integer maxima) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findByDiametroBetween(minima, maxima);

		iterable.forEach(planetaEntity -> {

			PlanetaDTO planetaDTO = new PlanetaDTO();

			planetaDTO.setId(planetaEntity.getIdPlaneta());
			planetaDTO.setClasse(planetaEntity.getClassePlaneta().getIdClasse());
			planetaDTO.setColonizado(planetaEntity.getPlanetaColonizado());
			planetaDTO.setData(planetaEntity.getDataDescobrimento());
			planetaDTO.setDiametro(planetaEntity.getDiametro());
			planetaDTO.setNome(planetaEntity.getNome());
			planetaDTO.setQuadrante(planetaEntity.getQuadranteEstelar().getIdQuadrante());
			planetaDTO.setTipoAtmo(planetaEntity.getTipoAtmosfera().getIdTipoAtmosfera());

			planetas.add(planetaDTO);
		});

		return planetas;

	}
	
	// listagem dos planetas por quadrante
	@Override
	public List<PlanetaEntity> listarPlanetasQuadrante(Integer quadranteId) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findById_quadrante(quadranteId);

		iterable.forEach(planetaEntity -> {

			PlanetaDTO planetaDTO = new PlanetaDTO();

			planetaDTO.setId(planetaEntity.getIdPlaneta());
			planetaDTO.setClasse(planetaEntity.getClassePlaneta().getIdClasse());
			planetaDTO.setColonizado(planetaEntity.getPlanetaColonizado());
			planetaDTO.setData(planetaEntity.getDataDescobrimento());
			planetaDTO.setDiametro(planetaEntity.getDiametro());
			planetaDTO.setNome(planetaEntity.getNome());
			planetaDTO.setQuadrante(planetaEntity.getQuadranteEstelar().getIdQuadrante());
			planetaDTO.setTipoAtmo(planetaEntity.getTipoAtmosfera().getIdTipoAtmosfera());

			planetas.add(planetaDTO);
		});

		return planetas;
	}

	@Override
	public int incluirPlaneta(PlanetaDTO planetaDTO) throws Exception {
		
		PlanetaEntity planateEntity = new PlanetaEntity();
		
		planateEntity.setNome(planetaDTO.getNome());
		planateEntity.setDataDescobrimento(planetaDTO.getData());
		planateEntity.setDiametro(planetaDTO.getDiametro());
		planateEntity.setMassa(planetaDTO.getMassa());
		planateEntity.setPlanetaColonizado(planetaDTO.isColonizado());
		
		if(planetaDTO.getId()!=0) {
			
			Optional<PlanetaEntity> opt = planetaRepository.findById(planetaDTO.getId());
			if ( ! opt.isPresent()) throw new PlanetaNaoEncontradoException("cliente não encontrado");
			planateEntity.setIdPlaneta(planetaDTO.getId());

		}
		
		PlanetaEntity planetaSalvo = planetaRepository.save(planateEntity);

		return planetaSalvo.getIdPlaneta();

	}
	
	@Override
	public List<PlanetaDTO> atualizarPlaneta(PlanetaDTO planetaDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluirPlaneta(Integer id) throws Exception {
		
		Optional<PlanetaEntity> opt = planetaRepository.findById(id);
		if ( ! opt.isPresent() ) throw new PlanetaNaoEncontradoException("cliente não encontrado");
		
		planetaRepository.delete(opt.get());
		
	}

}
