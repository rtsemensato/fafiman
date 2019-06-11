package br.com.fafiman.springxmlconfig.entity;

import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
                "\n\t\tnome='" + nome + '\'' +
                "\n\t}";
    }
}
