package model;

import rmi.ubs.UnidadeSaude;

public class UnidadeSaudeDTO {
    private String nces;
    private String nome;
    private String bairro;

    public UnidadeSaudeDTO() {
    }

    public UnidadeSaudeDTO(String nces, String nome, String bairro) {
        this.nces = nces;
        this.nome = nome;
        this.bairro = bairro;
    }

    public String getNces() {
        return nces;
    }

    public void setNces(String nces) {
        this.nces = nces;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public static UnidadeSaudeDTO parseUnidadeSaudeToUnidadeSaudeDTO(UnidadeSaude unidadeSaude) {
        UnidadeSaudeDTO unidadeSaudeDTO = new UnidadeSaudeDTO(unidadeSaude.getCnes(), unidadeSaude.getName(), unidadeSaude.getBairro());
        return unidadeSaudeDTO;
    }

    @Override
    public String toString() {
        return "UnidadeSaudeDTO{" +
                "nces='" + nces + '\'' +
                ", nome='" + nome + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
