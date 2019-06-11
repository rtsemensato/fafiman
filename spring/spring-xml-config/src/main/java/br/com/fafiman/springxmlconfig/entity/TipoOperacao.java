package br.com.fafiman.springxmlconfig.entity;

public enum TipoOperacao {

    EMPRESTIMO("Empréstimo"),
    RESERVA("Reserva"),
    DEVOLUCAO("Devolução");

    private String descricao;

    TipoOperacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
