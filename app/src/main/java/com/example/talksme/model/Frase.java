package com.example.talksme.model;

public class Frase {
    private  int id;
    private  int idSerie;
    private  int idPersonagem;
    private  String descricao;

    public Frase() {
        this.id = 0;
        this.idSerie = 0;
        this.idPersonagem = 0;
        this.descricao = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public int getIdPersonagem() {
        return idPersonagem;
    }

    public void setIdPersonagem(int idPersonagem) {
        this.idPersonagem = idPersonagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
