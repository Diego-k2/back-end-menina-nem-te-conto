package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "newsletter", schema = "damoday")
public class Newsletter {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_news")
    private long id;

    @Column(name = "email")
    private String email;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "dt_cadastro")
    private String dtCadastro;


    public Newsletter(String email, String nome, String sobrenome, String dtCadastro) {
        this.email = email;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dtCadastro = dtCadastro;
    }

    public Newsletter() {}

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }
}
