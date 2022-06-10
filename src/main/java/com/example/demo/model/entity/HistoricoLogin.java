package com.example.demo.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "hist_logins", schema = "demoday")
public class HistoricoLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "dt_login")
    private String dtLogin;

    @Column(name = "dt_logout")
    private String dtLogout;

    @ManyToOne
    @JoinColumn(name = "fk_iden_login")
    private IdentificacaoGeral identificacaoGeral;

    public HistoricoLogin(String dtLogin, IdentificacaoGeral identificacaoGeral) {
        this.dtLogin = dtLogin;
        this.identificacaoGeral = identificacaoGeral;
    }

    public HistoricoLogin(long id, String dtLogout) {
        this.id = id;
        this.dtLogout = dtLogout;
    }

    public HistoricoLogin(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDtLogin() {
        return dtLogin;
    }

    public void setDtLogin(String dtLogin) {
        this.dtLogin = dtLogin;
    }

    public String getDtLogout() {
        return dtLogout;
    }

    public void setDtLogout(String dtLogout) {
        this.dtLogout = dtLogout;
    }

    public IdentificacaoGeral getIdentificacaoGeral() {
        return identificacaoGeral;
    }

    public void setIdentificacaoGeral(IdentificacaoGeral identificacaoGeral) {
        this.identificacaoGeral = identificacaoGeral;
    }
}
