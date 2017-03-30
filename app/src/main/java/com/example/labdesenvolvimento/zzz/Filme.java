package com.example.labdesenvolvimento.zzz;

/**
 * Created by Lab. Desenvolvimento on 29/03/2017.
 */

public class Filme {

    private int ID;
    private int ano;
    private String titulo;

    public Filme(int ID, String titulo, int ano) {
        this.ID = ID;
        this.ano = ano;
        this.titulo = titulo;
    }

    public Filme() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
