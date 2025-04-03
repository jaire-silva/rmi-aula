package model;

public class UnidadeSaudeDTO {
    private String nces;
    private String nome;

    public UnidadeSaudeDTO() {
    }

    public UnidadeSaudeDTO(String nces, String nome) {
        this.nces = nces;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "UnidadeSaudeDTO{" +
                "nces='" + nces + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
