package br.com.arturguilherme.planeta.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_atmosfera database table.
 * 
 */
@Entity
@Table(name="tipo_atmosfera")
@NamedQuery(name="TipoAtmosfera.findAll", query="SELECT t FROM TipoAtmosferaEntity t")
public class TipoAtmosferaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_atmosfera")
	private int idTipoAtmosfera;

	private String descricao;

	//bi-directional many-to-one association to Planeta
	@OneToMany(mappedBy="tipoAtmosferaEntity")
	private List<PlanetaEntity> planetaEntities;

	public TipoAtmosferaEntity() {
	}

	public int getIdTipoAtmosfera() {
		return this.idTipoAtmosfera;
	}

	public void setIdTipoAtmosfera(int idTipoAtmosfera) {
		this.idTipoAtmosfera = idTipoAtmosfera;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<PlanetaEntity> getPlanetas() {
		return this.planetaEntities;
	}

	public void setPlanetas(List<PlanetaEntity> planetaEntities) {
		this.planetaEntities = planetaEntities;
	}

	public PlanetaEntity addPlaneta(PlanetaEntity planetaEntity) {
		getPlanetas().add(planetaEntity);
		planetaEntity.setTipoAtmosfera(this);

		return planetaEntity;
	}

	public PlanetaEntity removePlaneta(PlanetaEntity planetaEntity) {
		getPlanetas().remove(planetaEntity);
		planetaEntity.setTipoAtmosfera(null);

		return planetaEntity;
	}

}