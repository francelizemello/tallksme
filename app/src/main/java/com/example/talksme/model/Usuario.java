package com.example.talksme.model;

public class Usuario {
    private  int id;
    private String nome;
    private  String imgaemUrl;

    public Usuario() {
        this.id = 0;
        this.nome = "";
        this.imgaemUrl = "";
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

    public String getImgaemUrl() {
        return imgaemUrl;
    }

    public void setImgaemUrl(String imgaemUrl) {
        this.imgaemUrl = imgaemUrl;
    }
}
