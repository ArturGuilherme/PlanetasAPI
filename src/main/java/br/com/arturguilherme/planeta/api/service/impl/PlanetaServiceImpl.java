package br.com.arturguilherme.planeta.api.service.impl;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.entity.ClassePlanetaEntity;
import br.com.arturguilherme.planeta.api.entity.PlanetaEntity;
import br.com.arturguilherme.planeta.api.entity.QuadranteEstelarEntity;
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

	// Listagem de todos os planetas
	@Override
	public List<PlanetaEntity> listarTodosPlanetas() throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findAll();

		iterable.iterator().forEachRemaining(planetas::add);

		return planetas;

	}

	// Listagem dos planetas por classe
	@Override
	public List<PlanetaEntity> listarPlanetasClasse(String classeID) throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();

		Optional<ClassePlanetaEntity> optional_classe = classeRepository.findById(classeID);

		Iterable<PlanetaEntity> iterable = planetaRepository.findByClassePlanetaEntity(optional_classe.get());

		iterable.iterator().forEachRemaining(planetas::add);

		return planetas;

	}

	// Lista de planetas por atmosfera
	@Override
	public List<PlanetaEntity> listarPlanetasAtmosfera(Integer ID) throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();

		Optional<TipoAtmosferaEntity> optional_atmosfera = atmosferaRepository.findById(ID);

		Iterable<PlanetaEntity> iterable = planetaRepository.findByTipoAtmosferaEntity(optional_atmosfera.get());

		iterable.iterator().forEachRemaining(planetas::add);

		return planetas;

	}

	// listagem dos planetas por um intervalo de data
	@Override
	public List<PlanetaEntity> listarPlanetasData(Date dataInicio, Date dataFim) throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findByDataDescobrimentoBetween(dataInicio, dataFim);

		iterable.iterator().forEachRemaining(planetas::add);

		return planetas;

	}

	// listagem dos planetas por massa minima
	@Override
	public List<PlanetaEntity> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findByMassaGreaterThan(massaMinima);

		iterable.iterator().forEachRemaining(planetas::add);

		return planetas;

	}

	// listagem dis planetas por intervalo de diametro
	@Override
	public List<PlanetaEntity> listarPlanetasDiametro(Integer minima, Integer maxima) throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();

		Iterable<PlanetaEntity> iterable = planetaRepository.findByDiametroBetween(minima, maxima);

		iterable.iterator().forEachRemaining(planetas::add);

		return planetas;

	}

	// listagem dos planetas por quadrante
	@Override
	public List<PlanetaEntity> listarPlanetasQuadrante(Integer quadranteId) throws Exception {

		List<PlanetaEntity> planetas = new ArrayList<PlanetaEntity>();
		
		Optional<QuadranteEstelarEntity> optional_quadrante = quadranteRepository.findById(quadranteId);

		Iterable<PlanetaEntity> iterable = planetaRepository.findByQuadranteEstelarEntity(optional_quadrante.get());

		iterable.iterator().forEachRemaining(planetas::add);
		
		return planetas;
	}

	@Override
	public int incluirPlaneta(PlanetaEntity planetaEntity) throws Exception {

		if (planetaEntity.getIdPlaneta() != 0) {

			Optional<PlanetaEntity> opt = planetaRepository.findById(planetaEntity.getIdPlaneta());
			
			if (!opt.isPresent()) {
				
				throw new PlanetaNaoEncontradoException("Planeta não encontrado");
			
			}
			
		}

		PlanetaEntity planetaSalvo = planetaRepository.save(planetaEntity);

		return planetaSalvo.getIdPlaneta();

	}

	@Override
	public void excluirPlaneta(Integer id) throws Exception {

		Optional<PlanetaEntity> opt = planetaRepository.findById(id);
		
		if (!opt.isPresent()){
			throw new PlanetaNaoEncontradoException("Planeta não encontrado");
		}else {
			planetaRepository.delete(opt.get());
		}

	}

}
