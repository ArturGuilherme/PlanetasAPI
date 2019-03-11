package br.com.arturguilherme.planeta.api.dto;

import java.util.List;

public class ClassePlanetaDTO {

	private String idClasse;

	private String descricao;
	
	private List<PlanetaDTO> planetas;

	public String getIdClasse() {
		return idClasse;
	}

	public void setIdClasse(String idClasse) {
		this.idClasse = idClasse;
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
