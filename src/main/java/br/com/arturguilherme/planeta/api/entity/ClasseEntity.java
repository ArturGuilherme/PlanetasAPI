package br.com.arturguilherme.planeta.api.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="classe")
public class ClasseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "desc")
    @NotNull
    private String desc;

    @Column(name = "classe")
    @NotNull
    private char classe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
