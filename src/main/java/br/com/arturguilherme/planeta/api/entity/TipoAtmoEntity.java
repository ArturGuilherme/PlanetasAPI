package br.com.arturguilherme.planeta.api.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name="tipoAtmo")
public class TipoAtmoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id_tip;

    @Column(name = "desc")
    @NotNull
    private String desc;

    @OneToMany(mappedBy = "tipoAtmo")
    private List<PlanetaEntity> planetaEntities;

    public int getId_tip() {
        return id_tip;
    }

    public void setId_tip(int id_tip) {
        this.id_tip = id_tip;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
