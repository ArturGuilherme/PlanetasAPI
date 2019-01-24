package br.com.arturguilherme.planeta.api.controller;
import br.com.arturguilherme.planeta.api.service.facade.ServiceFacade;
import br.com.arturguilherme.planeta.api.dto.PlanetaDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/planeta")
public class PlanetaController {

    @Autowired
    private ServiceFacade serviceFacade;
    
    
    @RequestMapping(value = "/listar",produces = {"application/json"},method = RequestMethod.GET)
    public ResponseEntity<?> listarTodos(){

        List<PlanetaDTO> planetas = new ArrayList<PlanetaDTO>();
        
        try {
        
        	planetas = serviceFacade.listarTodosPlanetas();
            return new ResponseEntity(planetas, HttpStatus.OK);
        
        } catch (Exception ex) {
        
        	return new ResponseEntity(planetas, HttpStatus.INTERNAL_SERVER_ERROR);
        
        }

    }
    
    @RequestMapping(value = "/listarPlaneta/{id}",produces = {"application/json"},method = RequestMethod.GET)
    public ResponseEntity<?> listarPlanetaId(@PathVariable("id") Integer idPlaneta){

        
        try {
           
        	PlanetaDTO planeta = serviceFacade.listarPlanetaId(idPlaneta);
           
           if(planeta == null) {
        	
        	   return new ResponseEntity(planeta, HttpStatus.NOT_FOUND);
        	   
           }else {
        	
        	   return new ResponseEntity(planeta, HttpStatus.OK);
        	   
           }
              
        } catch (Exception ex) {
        	
            return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        

    }

}
