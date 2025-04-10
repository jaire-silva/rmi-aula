package tela;

import model.CidadeDTO;
import model.OcupacaoDTO;
import model.Pessoa;
import model.UnidadeSaudeDTO;
import rmi.cidade.Cidade;
import rmi.ubs.UnidadeSaude;
import rmiCbo.Cbo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<CidadeDTO> cidades = new ArrayList<>();
    private List<OcupacaoDTO> ocupacoes = new ArrayList<>();
    private List<UnidadeSaudeDTO> unidadesSaude = new ArrayList<>();
    private Pessoa pessoa = new Pessoa();
    Scanner scanner = new Scanner(System.in);

    public Menu(List<Cidade> cidades, List<Cbo> ocupacoes, List<UnidadeSaude> unidadesSaude) {
        setCidades(cidades);
        setOcupacoes(ocupacoes);
        setUnidadesSaude(unidadesSaude);
    }

    public void setNomePessoa() {
        System.out.print("Entre com o nome a ser cadastrado: ");
        String nome = scanner.nextLine();

        while (true) {
            if (nome != "") {
                pessoa.setNome(nome);
                break;
            } else {
                System.out.println("Entre com o nome a ser cadastrado: ");
                nome = scanner.nextLine();
            }
        }
    }

    public void setCPFPessoa() {
        System.out.print("Entre com o CPF a ser cadastrado: ");
        String cpf = scanner.nextLine();

        while (true) {
            if (cpf != "") {
                pessoa.setCpf(cpf);
                break;
            } else {
                System.out.println("Entre com o CPF a ser cadastrado: ");
                cpf = scanner.nextLine();
            }
        }
    }

    public void setCidadePessoa() {
        listaCidades();
        System.out.print("Entre com o número de uma das cidades acima para cadastrar: ");
        int cidadeIndex;

        while (true) {
            if (scanner.hasNextInt()) {
                cidadeIndex = scanner.nextInt();
                pessoa.setCidade(cidades.get(cidadeIndex));
                break;
            } else {
                System.out.print("Entre com o número de uma das cidades acima para cadastrar: ");
                scanner.next();
            }
        }
    }

    public void setOcupacaoPessoa() {
        listaOcupacoes();
        System.out.print("Entre com o número de uma das ocupações acima para cadastrar: ");
        int ocupacaoIndex;

        while (true) {
            if (scanner.hasNextInt()) {
                ocupacaoIndex = scanner.nextInt();
                pessoa.setOcupacao(ocupacoes.get(ocupacaoIndex));
                break;
            } else {
                System.out.print("Entre com o número de uma das ocupações acima para cadastrar: ");
                scanner.next();
            }
        }
    }

    private void listaCidades() {
        for (CidadeDTO cidade : cidades) {
            StringBuffer stringBuffer = new StringBuffer();

            stringBuffer.append(cidades.indexOf(cidade));
            stringBuffer.append(" - ");
            stringBuffer.append(cidade.getNome());

            System.out.println(stringBuffer.toString());
        }
    }

    private void listaOcupacoes() {
        for (OcupacaoDTO ocupacao : ocupacoes) {
            StringBuffer stringBuffer = new StringBuffer();

            stringBuffer.append(ocupacoes.indexOf(ocupacao));
            stringBuffer.append(" - ");
            stringBuffer.append(ocupacao.getNome());

            System.out.println(stringBuffer.toString());
        }
    }

    private void setCidades(List<Cidade> cidades) {
        for (Cidade cidade : cidades) {
            this.cidades.add(CidadeDTO.parseCidadeToCidadeDTO(cidade));
        }
    }

    private void setOcupacoes(List<Cbo> ocupacoes) {
        for (Cbo ocupacao : ocupacoes) {
            this.ocupacoes.add(OcupacaoDTO.parseCboToOcupacaoDTO(ocupacao));
        }
    }

    private void setUnidadesSaude(List<UnidadeSaude> unidadesSaude) {
        for (UnidadeSaude unidadeSaude : unidadesSaude) {
            this.unidadesSaude.add(UnidadeSaudeDTO.parseUnidadeSaudeToUnidadeSaudeDTO(unidadeSaude));
        }
    }


    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
