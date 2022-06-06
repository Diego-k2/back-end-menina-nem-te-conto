package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "newsletter", schema = "damoday")
public class Newsletter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_news")
    private long id;

    @Column(name = "email")
    private String email;

    @Column(name = "dt_cadastro")
    private String dtCadastro;

    public Newsletter(String email, String dtCadastro) {
        this.email = email;
        this.dtCadastro = dtCadastro;
    }

    public Newsletter() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
}
