package model;

import java.io.Serializable;

public class CidadeDTO implements Serializable {

    private String ibge;
    private String nome;

    public CidadeDTO() {
    }

    public CidadeDTO(String ibge, String nome) {
        this.ibge = ibge;
        this.nome = nome;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "ibge='" + ibge + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
