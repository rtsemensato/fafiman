package br.com.fafiman.springxmlconfig;

/**
 *
 * @author fernando
 */
public class Animal {

    private String raca;
    private String tipo;
    private String nome;

    public Animal() {
        this.raca = "Canino";
        this.tipo = "Cachorro";
        this.nome = "Totó";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal{" + "raca=" + raca + ", tipo=" + tipo + ", nome=" + nome + '}';
    }

}
