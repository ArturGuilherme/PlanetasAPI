package br.com.arturguilherme.planeta.api.dto;

import java.util.List;


public class QuadranteEstelarDTO {

	private int idQuadrante;

	private String descricao;
	
	private List<PlanetaDTO> planetas;

	public int getIdQuadrante() {
		return idQuadrante;
	}

	public void setIdQuadrante(int idQuadrante) {
		this.idQuadrante = idQuadrante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<PlanetaDTO> getPlanetas() {
		return planetas;
	}

	public void setPlanetas(List<PlanetaDTO> planetaDTO) {
		this.planetas = planetaDTO;
	}
	
	
	
}
