package proxy;
import java.util.ArrayList;
import java.util.List;

import modelo.Filme;
import movimentacoes.Locacao;
import movimentacoes.Devolucao;
import pessoa.Funcionario;
import pessoa.Cliente;

class SistLocadora implements Locadora {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private List<Filme> filmes = new ArrayList<Filme>();

    public void cadastrarCliente(Cliente cliente) {
        // Implementação do cadastro de cliente
        clientes.add(cliente);
        System.out.println("================\n");
        System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso.\n");
        System.out.println("================\n");
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        // Implementação do cadastro de funcionário
        funcionarios.add(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " cadastrado com sucesso.");
    }

    public void cadastrarFilme(Filme filme) {
        // Implementação do cadastro de filme
        filmes.add(filme);
        System.out.println("Filme " + filme.getNome() + " cadastrado com sucesso.\n");
        //System.out.println("================\n");
    }

    public void registrarLocacao(Locacao locacao) {
        locacao.alugar();
        //locacao.getCliente().adicionarLocacao(locacao);
    }

    public void registrarDevolucao(Devolucao devolucao) {
        devolucao.devolver();
        //devolucao.getLocacao().getCliente().removerLocacao(locacao);
    }

    public void listarFilmes() {
        System.out.println("\n================\n");
        System.out.println("Filmes cadastrados:");
        for (Filme filme : filmes) {
            System.out.println("- " + filme.getNome());
        }
    }

}
