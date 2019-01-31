	package br.com.arturguilherme.planeta.api.service.impl;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.entity.PlanetaEntity;
import br.com.arturguilherme.planeta.api.exception.PlanetaNaoEncontradoException;
import br.com.arturguilherme.planeta.api.repository.PlanetaRepository;
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

	// Listagem de todos os planetas
	@Override
	public List<PlanetaDTO> listarTodosPlanetas() throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findAll();

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

	// Listagem de apenas um planeta por ID
	@Override
	public PlanetaDTO listarPlanetaId(Integer id) throws Exception {

		Optional<PlanetaEntity> planetaEntity = planetaRepository.findById(id);

		PlanetaDTO planetaDTO = new PlanetaDTO();

		planetaDTO.setId(planetaEntity.get().getIdPlaneta());
		planetaDTO.setClasse(planetaEntity.get().getClassePlaneta().getIdClasse());
		planetaDTO.setColonizado(planetaEntity.get().getPlanetaColonizado());
		planetaDTO.setData(planetaEntity.get().getDataDescobrimento());
		planetaDTO.setDiametro(planetaEntity.get().getDiametro());
		planetaDTO.setNome(planetaEntity.get().getNome());
		planetaDTO.setQuadrante(planetaEntity.get().getQuadranteEstelar().getIdQuadrante());
		planetaDTO.setTipoAtmo(planetaEntity.get().getTipoAtmosfera().getIdTipoAtmosfera());

		return planetaDTO;

	}

	// Listagem dos planetas por classe
	@Override
	public List<PlanetaDTO> listarPlanetasClasse(String classeID) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findAllClasse(classeID);

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

	// Lista de planetas por atmosfera
	@Override
	public List<PlanetaDTO> listarPlanetasAtmosfera(Integer ID) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findAllAtmofera(ID);

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
	public List<PlanetaDTO> listarPlanetasHabitaveis() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	// listagem dos planetas por um intervalo de data
	@Override
	public List<PlanetaDTO> listarPlanetasData(Date dataInicio, Date dataFim) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findAllData(dataInicio, dataFim);

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
	public List<PlanetaDTO> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findAllMassa(massaMinima);

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
	public List<PlanetaDTO> listarPlanetasDiametro(Integer minima, Integer maxima) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findAllDiametro(minima, maxima);

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

	// listagem dos planetas por quadrante
	@Override
	public List<PlanetaDTO> listarPlanetasQuadrante(Integer quadranteId) throws Exception {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findAllQuadrante(quadranteId);

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

}
