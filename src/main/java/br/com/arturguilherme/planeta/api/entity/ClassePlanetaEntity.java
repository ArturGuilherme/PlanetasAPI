package br.com.arturguilherme.planeta.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the classe_planeta database table.
 * 
 */
@Entity
@Table(name="classe_planeta")
@NamedQuery(name="ClassePlaneta.findAll", query="SELECT c FROM ClassePlanetaEntity c")
public class ClassePlanetaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_classe")
	private String idClasse;

	private String descricao;

	//bi-directional many-to-one association to Planeta
	@OneToMany(mappedBy="classePlaneta")
	private List<PlanetaEntity> planetas;

	public ClassePlanetaEntity() {
	}

	public String getIdClasse() {
		return this.idClasse;
	}

	public void setIdClasse(String idClasse) {
		this.idClasse = idClasse;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<PlanetaEntity> getPlanetas() {
		return this.planetas;
	}

	public void setPlanetas(List<PlanetaEntity> planetaEntities) {
		this.planetas = planetaEntities;
	}

	public PlanetaEntity addPlaneta(PlanetaEntity planetaEntity) {
		getPlanetas().add(planetaEntity);
		planetaEntity.setClassePlaneta(this);

		return planetaEntity;
	}

	public PlanetaEntity removePlaneta(PlanetaEntity planetaEntity) {
		getPlanetas().remove(planetaEntity);
		planetaEntity.setClassePlaneta(null);

		return planetaEntity;
	}

}