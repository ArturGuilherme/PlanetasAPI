package br.com.arturguilherme.planeta.api.entity;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="classe")
public class ClasseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany(mappedBy = "classe")
    private int id_cla;

    @Column(name = "desc")
    @NotNull
    private String desc;

    @Column(name = "classe")
    @NotNull
    private char classe;

    public int getId_cla() {
        return id_cla;
    }

    public void setId_cla(int id_cla) {
        this.id_cla = id_cla;
    }

    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
