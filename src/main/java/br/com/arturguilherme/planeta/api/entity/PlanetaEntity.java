package br.com.arturguilherme.planeta.api.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="planeta")
public class PlanetaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome")
    @NotNull
    private String nome;

    @Column(name = "diametro")
    @NotNull
    private String diametro;

    @ManyToOne
    @JoinColumn(name ="id_cla")
    @NotNull
    private ClasseEntity classe;

    @ManyToOne
    @JoinColumn(name ="id_tip")
    @NotNull
    private TipoAtmoEntity tipoAtmo;

    @Column(name = "colonizado")
    @NotNull
    private boolean colonizado;

    @Column(name = "data")
    @NotNull
    private Date data;

    @ManyToOne
    @JoinColumn(name ="id_qua")
    @NotNull
    private QuadranteEntity quadrante;


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

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
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

    public ClasseEntity getClasse() {
        return classe;
    }

    public void setClasse(ClasseEntity classe) {
        this.classe = classe;
    }

    public TipoAtmoEntity getTipoAtmo() {
        return tipoAtmo;
    }

    public void setTipoAtmo(TipoAtmoEntity tipoAtmo) {
        this.tipoAtmo = tipoAtmo;
    }

    public QuadranteEntity getQuadrante() {
        return quadrante;
    }

    public void setQuadrante(QuadranteEntity quadrante) {
        this.quadrante = quadrante;
    }
}
