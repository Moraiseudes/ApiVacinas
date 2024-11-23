package com.example.ApiVacinas.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "pontosDeVacinacao")
public class ApiVacinas {
    @Id
    @GeneratedValue
    private long id;
    private String cidade;
    private String pontoDevacinacao;

    public ApiVacinas() {

    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPontoDevacinacao() {
        return pontoDevacinacao;
    }

    public void setPontoDevacinacao(String pontoDevacinacao) {
        this.pontoDevacinacao = pontoDevacinacao;
    }


    }





