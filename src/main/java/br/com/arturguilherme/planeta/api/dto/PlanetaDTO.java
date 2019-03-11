package br.com.arturguilherme.planeta.api.dto;

import java.util.Date;

public class PlanetaDTO {

    private int idPlaneta;
    private String nome;
    private int diametro;
    private ClassePlanetaDTO classePlaneta;
    private TipoAtmosferaDTO tipoAtmosfera;
    private boolean planetaColonizado;
    private Date dataDescobrimento;
    private QuadranteEstelarDTO quadranteEstelar;
    private int massa;
    
	public int getIdPlaneta() {
		return idPlaneta;
	}
	public void setIdPlaneta(int idPlaneta) {
		this.idPlaneta = idPlaneta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDiametro() {
		return diametro;
	}
	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}
	public ClassePlanetaDTO getClassePlaneta() {
		return classePlaneta;
	}
	public void setClassePlaneta(ClassePlanetaDTO classePlaneta) {
		this.classePlaneta = classePlaneta;
	}
	public TipoAtmosferaDTO getTipoAtmosfera() {
		return tipoAtmosfera;
	}
	public void setTipoAtmosfera(TipoAtmosferaDTO tipoAtmosfera) {
		this.tipoAtmosfera = tipoAtmosfera;
	}
	public boolean isPlanetaColonizado() {
		return planetaColonizado;
	}
	public void setPlanetaColonizado(boolean planetaColonizado) {
		this.planetaColonizado = planetaColonizado;
	}
	public Date getDataDescobrimento() {
		return dataDescobrimento;
	}
	public void setDataDescobrimento(Date dataDescobrimento) {
		this.dataDescobrimento = dataDescobrimento;
	}
	public QuadranteEstelarDTO getQuadranteEstelar() {
		return quadranteEstelar;
	}
	public void setQuadranteEstelar(QuadranteEstelarDTO quadranteEstelar) {
		this.quadranteEstelar = quadranteEstelar;
	}
	public int getMassa() {
		return massa;
	}
	public void setMassa(int massa) {
		this.massa = massa;
	}
 
}
