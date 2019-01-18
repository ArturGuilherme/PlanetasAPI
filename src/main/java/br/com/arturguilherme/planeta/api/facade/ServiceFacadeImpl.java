package br.com.arturguilherme.planeta.api.facade;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.service.PlanetaService;

@Service
@Transactional(rollbackFor = Exception.class)
public class ServiceFacadeImpl implements ServiceFacade{

	@Autowired
	private PlanetaService planetaService;

	@Override
	public List<PlanetaDTO> listarTodosPlanetas() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PlanetaDTO listarPlanetaId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanetaDTO> listarPlanetasClasse(String classeID) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanetaDTO> listarPlanetasAtmosfera(Integer ID) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanetaDTO> listarPlanetasHabitaveis() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanetaDTO> listarPlanetasData(Date dataInicio, Date dataFim) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanetaDTO> listarPlanetasMaiorMassa(Integer massaMinima) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanetaDTO> listarPlanetasDiametro(Integer minima, Integer maxima) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanetaDTO> incluirPlaneta(PlanetaDTO planetaDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanetaDTO> atualizarPlaneta(PlanetaDTO planetaDTO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlanetaDTO> excluirPlaneta(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
