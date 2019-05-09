package com.example.talksme.model;

public class Serie {

    private  int id;
    private  String nome;
    private  int tipo;
    private  String cartaz;

    public Serie() {
        this.id = 0;
        this.nome = "";
        this.tipo = 0;
        this.cartaz="";
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

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getCartaz() {
        return cartaz;
    }

    public void setCartaz(String cartaz) {
        this.cartaz = cartaz;
    }
}
