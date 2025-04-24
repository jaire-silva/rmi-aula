package model;

import rmi.cidade.Cidade;

import java.io.Serializable;

public class CidadeDTO implements Serializable {

    private String ibge;
    private String nome;
    private int populacao;

    public CidadeDTO() {
    }

    public CidadeDTO(String ibge, String nome, int populacao) {
        this.ibge = ibge;
        this.nome = nome;
        this.populacao = populacao;
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

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public static CidadeDTO parseCidadeToCidadeDTO(Cidade cidade) {
        CidadeDTO cidadeDTO = new CidadeDTO(cidade.getIbge(), cidade.getNome(), cidade.getPopulacao());
        return cidadeDTO;
    }

    @Override
    public String toString() {
        return "CidadeDTO{" +
                "ibge='" + ibge + '\'' +
                ", nome='" + nome + '\'' +
                ", populacao=" + populacao +
                '}';
    }
}
