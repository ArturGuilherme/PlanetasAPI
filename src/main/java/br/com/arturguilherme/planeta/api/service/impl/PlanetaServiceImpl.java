package br.com.arturguilherme.planeta.api.service.impl;

import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;
import br.com.arturguilherme.planeta.api.service.PlanetaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanetaServiceImpl implements PlanetaService {

    @Override
    public List<PlanetaDTO> listarPlanestasDTO() throws Exception {

        List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();

        PlanetaDTO planeta1 = new PlanetaDTO();
        PlanetaDTO planeta2 = new PlanetaDTO();

        planeta1.setId(1);
        planeta1.setNome("Terra");

        planeta2.setId(2);
        planeta2.setNome("Marte");

        planetas.add(planeta1);
        planetas.add(planeta2);

        return planetas;
    }

}
