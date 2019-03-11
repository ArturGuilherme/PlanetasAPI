package br.com.arturguilherme.planeta.api.dto;

import java.util.List;

public class TipoAtmosferaDTO {

	private int idTipoAtmosfera;

	private String descricao;
	
	private List<PlanetaDTO> planetas;

	public int getIdTipoAtmosfera() {
		return idTipoAtmosfera;
	}

	public void setIdTipoAtmosfera(int idTipoAtmosfera) {
		this.idTipoAtmosfera = idTipoAtmosfera;
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
