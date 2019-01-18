package br.com.arturguilherme.planeta.api.service.impl;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.entity.PlanetaEntity;
import br.com.arturguilherme.planeta.api.repository.PlanetaRepository;
import br.com.arturguilherme.planeta.api.service.PlanetaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PlanetaServiceImpl implements PlanetaService {

	@Autowired
	private PlanetaRepository planetaRepository;
	
    @Override
    public List<PlanetaDTO> listarTodosPlanetas() throws Exception {

        List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();
        
        Iterable<PlanetaEntity> iterable = planetaRepository.findAll();

        iterable.forEach(planetaEntity->{
			
        	PlanetaDTO planetaDTO = new PlanetaDTO();
			planetaDTO.setId(planetaEntity.getIdPlaneta());
			planetaDTO.setClasse(planetaEntity.getClassePlaneta().getIdClasse());
			planetaDTO.setColonizado(planetaEntity.getPlanetaColonizado());
			planetaDTO.setData(planetaEntity.getDataDescobrimento());
			planetaDTO.setDiamentro(planetaEntity.getDiametro());
			planetaDTO.setNome(planetaEntity.getNome());
			planetaDTO.setQuadrante(planetaEntity.getQuadranteEstelar().getIdQuadrante());
			planetaDTO.setTipoAtmo(planetaEntity.getTipoAtmosfera().getIdTipoAtmosfera());
			
			planetas.add(planetaDTO);
		});
        
		return planetas;

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
