package br.com.fafiman.springxmlconfig.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Publicacao implements Serializable {

    private String isbn;
    private String titulo;
    private List<Exemplar> exemplares;

    public Publicacao() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void gerarExemplares(int qtde) {
        if(exemplares == null || exemplares.isEmpty()) {
            exemplares = new ArrayList<Exemplar>();
        }
        for(int i = 1; i <= qtde; i++) {
            Exemplar ex = new Exemplar();
            ex.setPublicacao(this);
            ex.setCodigo("ABC_" + i);
            ex.setQrCode("123456789" + i);
            this.exemplares.add(ex);
        }
    }

    public Exemplar getExemplarDisponivel() {
        return exemplares.remove(0);
    }

    @Override
    public String toString() {
        return "Publicacao {" +
                "\n\t\t\tisbn='" + isbn + '\'' +
                ", \n\t\t\ttitulo='" + titulo + '\'' +
                "\n\t\t}";
    }
}
