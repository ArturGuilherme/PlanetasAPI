package br.com.arturguilherme.planeta.api.dto;

import java.util.Date;

public class PlanetaDTO {

    private int id_planeta;
    private String nome;
    private int diametro;
    private String id_classe;
    private int id_tipo_atmosfera;
    private boolean planeta_colonizado;
    private Date data_descobrimento;
    private int id_quadrante;
    private int massa;

    public int getId() {
        return id_planeta;
    }

    public void setId(int id) {
        this.id_planeta = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return id_classe;
    }

    public void setClasse(String classe) {
        this.id_classe = classe;
    }

    public int getTipoAtmo() {
        return id_tipo_atmosfera;
    }

    public void setTipoAtmo(int tipoAtmo) {
        this.id_tipo_atmosfera = tipoAtmo;
    }

    public boolean isColonizado() {
        return planeta_colonizado;
    }

    public void setColonizado(boolean colonizado) {
        this.planeta_colonizado = colonizado;
    }

    public Date getData() {
        return data_descobrimento;
    }

    public void setData(Date data) {
        this.data_descobrimento = data;
    }

    public int getQuadrante() {
        return id_quadrante;
    }

    public void setQuadrante(int quadrante) {
        this.id_quadrante = quadrante;
    }

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getMassa() {
		return massa;
	}

	public void setMassa(int massa) {
		this.massa = massa;
	}
    
    
}
