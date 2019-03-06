package br.com.arturguilherme.planeta.api.controller;

import br.com.arturguilherme.planeta.api.service.facade.ServiceFacade;
import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.exception.PlanetaNaoEncontradoException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/planeta")
public class PlanetaController {

	@Autowired
	private ServiceFacade serviceFacade;

	// *** Listagem de todos os planetas
	@RequestMapping(value = "/listar", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<?> listarTodos() {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		try {

			planetas = serviceFacade.listarTodosPlanetas();
			return new ResponseEntity(planetas, HttpStatus.OK); 

		} catch (Exception ex) {

			return new ResponseEntity(planetas, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	// listagem dos planetas por tipo atmosfera
	@RequestMapping(value = "/listarPlaneta/atmosfera/{id_atmosfera}", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<?> listarTodosAtmosfera(@PathVariable("id_atmosfera") Integer id_atmosfera) {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		try {

			planetas = serviceFacade.listarPlanetasAtmosfera(id_atmosfera);
			return new ResponseEntity(planetas, HttpStatus.OK);

		} catch (Exception ex) {

			return new ResponseEntity(planetas, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	// listagem dos planentas por quadrante
	@RequestMapping(value = "/listarPlaneta/quadrante/{id_quadrante}", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<?> listarTodosQuandrante(@PathVariable("id_quadrante") Integer id_quadrante) {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		try {

			planetas = serviceFacade.listarPlanetasQuadrante(id_quadrante);
			return new ResponseEntity(planetas, HttpStatus.OK);

		} catch (Exception ex) {

			return new ResponseEntity(planetas, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	// listagem dos plantas por classe, só que dessa vez apenas tipo D
	@RequestMapping(value = "/listarPlaneta/habitaveis", produces = { "application/json" }, method = RequestMethod.GET)
	public ResponseEntity<?> listarTodosHabitaveis() {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		try {

			planetas = serviceFacade.listarPlanetasClasse("D");
			return new ResponseEntity(planetas, HttpStatus.OK);

		} catch (Exception ex) {

			return new ResponseEntity(planetas, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	// listagem dos planetas por massa minima
	@RequestMapping(value = "/listarPlaneta/massa/{massa}", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<?> listarTodosMassa(@PathVariable("massa") Integer massa) {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		try {

			planetas = serviceFacade.listarPlanetasMaiorMassa(massa);
			return new ResponseEntity(planetas, HttpStatus.OK);

		} catch (Exception ex) {

			return new ResponseEntity(planetas, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	// listagem dos planetas por classe
	@RequestMapping(value = "/listarPlaneta/classe/{id_classe}", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<?> listarTodosClasse(@PathVariable("id_classe") String id_classe) {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		try {

			planetas = serviceFacade.listarPlanetasClasse(id_classe);
			return new ResponseEntity(planetas, HttpStatus.OK);

		} catch (Exception ex) {

			return new ResponseEntity(planetas, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	// listagem dos planetas por data
	@RequestMapping(value = "/listarPlaneta/diametro/{minima}/{maxima}", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<?> listarTodosDiametro(@PathVariable("minima") Integer minima,
			@PathVariable("maxima") Integer maxima) {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		try {

			planetas = serviceFacade.listarPlanetasDiametro(minima, maxima);
			return new ResponseEntity(planetas, HttpStatus.OK);

		} catch (Exception ex) {

			return new ResponseEntity(planetas, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	// listagem dos planetas por intervalo de diameamtro
	@RequestMapping(value = "/listarPlaneta/descobrimento/{dataInicio}/{dataFim}", produces = {
			"application/json" }, method = RequestMethod.GET)
	public ResponseEntity<?> listarTodosData(@PathVariable("dataInicio") Date dataInicio,
			@PathVariable("dataFim") Date dataFim) {

		List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

		try {

			planetas = serviceFacade.listarPlanetasData(dataInicio, dataFim);
			return new ResponseEntity(planetas, HttpStatus.OK);

		} catch (Exception ex) {

			return new ResponseEntity(planetas, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

	// listagem dos planetas por intervalo de diameamtro
	@RequestMapping(value = "/cadastrar/", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> cadastrarPlaneta(@RequestBody PlanetaDTO planeta) {

		try {

			int id = serviceFacade.incluirPlaneta(planeta);
			String response = "/listar";
			return new ResponseEntity(response, HttpStatus.OK);

		} catch (PlanetaNaoEncontradoException cnex) {
			return new ResponseEntity(null, HttpStatus.NOT_FOUND);
		} catch (Exception ex) {
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	// listagem dos planetas por intervalo de diameamtro
	@RequestMapping(value = "/atualizar/", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	public ResponseEntity<?> atualizarPlaneta(@RequestBody PlanetaDTO planeta) {

		try {

			int id = serviceFacade.incluirPlaneta(planeta);
			String response = "/listar";
			return new ResponseEntity(response, HttpStatus.OK);

		} catch (PlanetaNaoEncontradoException cnex) {
			return new ResponseEntity(null, HttpStatus.NOT_FOUND);
		} catch (Exception ex) {
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	// listagem dos planetas por classe
	@RequestMapping(value = "/excluir/{id}", produces = { "application/json" }, method = RequestMethod.DELETE)
	public ResponseEntity<?> excluirPlaneta(@PathVariable("id") Integer id) {

		try {

			serviceFacade.excluirPlaneta(id);
			return new ResponseEntity(null, HttpStatus.OK);

		} catch (PlanetaNaoEncontradoException cnex) {
			return new ResponseEntity(null, HttpStatus.NOT_FOUND);
		} catch (Exception ex) {
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
