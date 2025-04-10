package model;


public class Pessoa {
    private String nome;
    private String cpf;
    private CidadeDTO cidade;
    private OcupacaoDTO ocupacao;
    private UnidadeSaudeDTO uniSaude;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, CidadeDTO cidade, OcupacaoDTO ocupacao, UnidadeSaudeDTO uniSaude) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.ocupacao = ocupacao;
        this.uniSaude = uniSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public CidadeDTO getCidade() {
        return cidade;
    }

    public void setCidade(CidadeDTO cidade) {
        this.cidade = cidade;
    }

    public OcupacaoDTO getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(OcupacaoDTO ocupacao) {
        this.ocupacao = ocupacao;
    }

    public UnidadeSaudeDTO getUniSaude() {
        return uniSaude;
    }

    public void setUniSaude(UnidadeSaudeDTO uniSaude) {
        this.uniSaude = uniSaude;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cidade=" + cidade +
                ", ocupacaoDTO=" + ocupacao +
                ", uniSaude=" + uniSaude +
                '}';
    }
}
