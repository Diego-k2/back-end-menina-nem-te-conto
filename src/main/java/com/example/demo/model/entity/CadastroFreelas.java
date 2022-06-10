package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "cadastro_freelas", schema = "demoday")
public class CadastroFreelas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "mei")
    private String mei;

    @Column(name = "area_formacao")
    private String areaFormacao;

    @ManyToOne
    @JoinColumn (name = "fk_iden_ger")
    private IdentificacaoGeral identificacaoGeral;



    public CadastroFreelas(String mei, String areaFormacao, IdentificacaoGeral identificacaoGeral) {
        this.mei = mei;
        this.areaFormacao = areaFormacao;
        this.identificacaoGeral = identificacaoGeral;
    }

    public CadastroFreelas(){}



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMei() {
        return mei;
    }

    public void setMei(String mei) {
        this.mei = mei;
    }

    public String getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(String areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public IdentificacaoGeral getIdentificacaoGeral() {
        return identificacaoGeral;
    }

    public void setIdentificacaoGeral(IdentificacaoGeral identificacaoGeral) {
        this.identificacaoGeral = identificacaoGeral;
    }

}
