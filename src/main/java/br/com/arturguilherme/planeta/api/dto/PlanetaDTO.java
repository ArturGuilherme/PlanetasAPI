package br.com.arturguilherme.planeta.api.dto;

import java.util.Date;

public class PlanetaDTO {

    private int id;
    private String nome;
    private String diametro;
    private char classe;
    private int tipoAtmo;
    private boolean colonizado;
    private Date data;
    private int quadrante;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiamentro() {
        return diametro;
    }

    public void setDiamentro(String diamentro) {
        this.diametro = diamentro;
    }

    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public int getTipoAtmo() {
        return tipoAtmo;
    }

    public void setTipoAtmo(int tipoAtmo) {
        this.tipoAtmo = tipoAtmo;
    }

    public boolean isColonizado() {
        return colonizado;
    }

    public void setColonizado(boolean colonizado) {
        this.colonizado = colonizado;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuadrante() {
        return quadrante;
    }

    public void setQuadrante(int quadrante) {
        this.quadrante = quadrante;
    }
}
