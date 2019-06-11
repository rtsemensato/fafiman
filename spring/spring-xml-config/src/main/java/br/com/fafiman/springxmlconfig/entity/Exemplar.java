package br.com.fafiman.springxmlconfig.entity;

import java.io.Serializable;

public class Exemplar implements Serializable {

    private String qrCode;
    private String codigo;
    private Publicacao publicacao;

    public Exemplar() {
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    @Override
    public String toString() {
        return "Exemplar {" +
                "\n\t\tqrCode='" + qrCode + '\'' +
                ", \n\t\tcodigo='" + codigo + '\'' +
                ", \n\t\tpublicacao='" + publicacao + '\'' +
                "\n\t}";
    }
}
