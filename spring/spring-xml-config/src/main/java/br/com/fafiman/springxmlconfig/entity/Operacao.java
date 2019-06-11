package br.com.fafiman.springxmlconfig.entity;

import java.io.Serializable;
import java.util.Date;

public class Operacao implements Serializable {

    private TipoOperacao tipoOperacao;
    private Date data;
    private Exemplar exemplar;
    private Pessoa pessoa;

    public Operacao() {
    }

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Operacao {" +
                "\n\ttipoOperacao=" + tipoOperacao +
                ", \n\tdata=" + data +
                ", \n\texemplar=" + exemplar +
                ", \n\tpessoa=" + pessoa +
                "\n}";
    }
}
