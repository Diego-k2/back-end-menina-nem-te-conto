package com.example.demo.model.entity;


import javax.persistence.*;

@Entity
@Table(name = "fotos_iden_ger", schema = "demoday")
public class FotosIdenGer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private long id;

    @Column(name = "caminho_ft")
    private String caminhoFt;

    @ManyToOne
    @JoinColumn(name = "fk_iden")
    private IdentificacaoGeral identificacaoGeral;

    public FotosIdenGer(String caminhoFt, IdentificacaoGeral identificacaoGeral) {
        this.caminhoFt = caminhoFt;
        this.identificacaoGeral = identificacaoGeral;
    }

    public FotosIdenGer() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCaminhoFt() {
        return caminhoFt;
    }

    public void setCaminhoFt(String caminhoFt) {
        this.caminhoFt = caminhoFt;
    }

    public IdentificacaoGeral getIdentificacaoGeral() {
        return identificacaoGeral;
    }

    public void setIdentificacaoGeral(IdentificacaoGeral identificacaoGeral) {
        this.identificacaoGeral = identificacaoGeral;
    }
}
