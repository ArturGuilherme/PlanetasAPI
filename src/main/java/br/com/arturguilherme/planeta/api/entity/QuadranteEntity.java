package br.com.arturguilherme.planeta.api.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="quadrante")
public class QuadranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "quadrante")
    private int id_qua;

    @Column(name = "desc")
    @NotNull
    private String desc;

    public int getId_qua() {
        return id_qua;
    }

    public void setId_qua(int id_qua) {
        this.id_qua = id_qua;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
