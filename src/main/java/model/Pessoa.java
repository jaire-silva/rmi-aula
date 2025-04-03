package model;


public class Pessoa {
    private String nome;
    private String cpf;
    private CidadeDTO cidade;
    private OcupacaoDTO ocupacaoDTO;
    private UnidadeSaudeDTO uniSaude;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, CidadeDTO cidade, OcupacaoDTO ocupacaoDTO, UnidadeSaudeDTO uniSaude) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.ocupacaoDTO = ocupacaoDTO;
        this.uniSaude = uniSaude;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public CidadeDTO getCidade() {
        return cidade;
    }

    public OcupacaoDTO getOcupacaoDTO() {
        return ocupacaoDTO;
    }

    public UnidadeSaudeDTO getUniSaude() {
        return uniSaude;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cidade=" + cidade +
                ", ocupacaoDTO=" + ocupacaoDTO +
                ", uniSaude=" + uniSaude +
                '}';
    }
}
