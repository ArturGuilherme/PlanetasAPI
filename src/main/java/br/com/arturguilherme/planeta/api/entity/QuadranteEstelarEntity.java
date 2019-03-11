package br.com.arturguilherme.planeta.api.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the quadrante_estelar database table.
 * 
 */
@Entity
@Table(name="quadrante_estelar")
@NamedQuery(name="QuadranteEstelar.findAll", query="SELECT q FROM QuadranteEstelarEntity q")
public class QuadranteEstelarEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_quadrante")
	private int idQuadrante;

	private String descricao;

	//bi-directional many-to-one association to Planeta
	@OneToMany(mappedBy="quadranteEstelar")
	private List<PlanetaEntity> planetas;

	public QuadranteEstelarEntity() {
	}

	public int getIdQuadrante() {
		return this.idQuadrante;
	}

	public void setIdQuadrante(int idQuadrante) {
		this.idQuadrante = idQuadrante;
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
		planetaEntity.setQuadranteEstelar(this);

		return planetaEntity;
	}

	public PlanetaEntity removePlaneta(PlanetaEntity planetaEntity) {
		getPlanetas().remove(planetaEntity);
		planetaEntity.setQuadranteEstelar(null);

		return planetaEntity;
	}

}