package com.example.talksme.model;

public class Personagem {
    private  int id;
    private  String nome;
    private  int idSerie;
    private String imagemUrl;

    public Personagem(int id, String nome, int idSerie, String imagemUrl) {
        this.id = id;
        this.nome = nome;
        this.idSerie = idSerie;
        this.imagemUrl = imagemUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public String getImagemUrl() {
        return imagemUrl;
    }

    public void setImagemUrl(String imagemUrl) {
        this.imagemUrl = imagemUrl;
    }
}
