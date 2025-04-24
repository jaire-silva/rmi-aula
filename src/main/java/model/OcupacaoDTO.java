package model;

import rmi.cidade.Cidade;
import rmiCBO.Cbo;

public class OcupacaoDTO {
    private String cbo;
    private String nome;

    public OcupacaoDTO() {
    }

    public OcupacaoDTO(String cbo, String nome) {
        this.cbo = cbo;
        this.nome = nome;
    }

    public String getCbo() {
        return cbo;
    }

    public void setCbo(String cbo) {
        this.cbo = cbo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static OcupacaoDTO parseCboToOcupacaoDTO(Cbo ocupacao) {
        OcupacaoDTO ocupacaoDTO = new OcupacaoDTO(ocupacao.getCodCbo(), ocupacao.getProfissao());
        return ocupacaoDTO;
    }

    @Override
    public String toString() {
        return "OcupacaoDTO{" +
                "cbo='" + cbo + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
