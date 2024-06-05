package proxy;
import java.util.ArrayList;
import java.util.List;

import modelo.Filme;
import movimentacoes.Locacao;

class SistLocadora implements Locadora {
    private List<Cliente> clientes = new ArrayList<Cliente>();
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private List<Filme> filmes = new ArrayList<Filme>();
    
    public void cadastrarCliente(Cliente cliente) {
        // Implementação do cadastro de cliente
        clientes.add(cliente);
        System.out.println("Cliente " + cliente.getNome() + " cadastrado com sucesso.");
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        // Implementação do cadastro de funcionário
        funcionarios.add(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " cadastrado com sucesso.");
    }

    public void cadastrarFilme(Filme filme) {
        // Implementação do cadastro de filme
        filmes.add(filme);
        System.out.println("Filme " + filme.getNome() + " cadastrado com sucesso.");
    }

    public void registrarLocacao(Locacao locacao) {
        // Implementação do registro de locação, aqui so precisa fazer locacao.alugar() acredito
        locacao.alugar();
        System.out.println("Locação registrada com sucesso.");
    }

    public void registrarDevolucao(Locacao locacao) {
        // Implementação do registro de devolução, aqui so precisa fazer locacao.devolver() acredito
       // locacao.devolver();
        //System.out.println("Devolução registrada com sucesso.");
    }
}
