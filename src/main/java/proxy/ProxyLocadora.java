package proxy;

import java.util.ArrayList;

import modelo.Filme;
import movimentacoes.Locacao;
import movimentacoes.Devolucao;
import pessoa.Funcionario;
import pessoa.Cliente;

public class ProxyLocadora implements Locadora {
    private SistLocadora sistemaLocadora;
    private Funcionario funcionario;
    private ArrayList<Filme> filmes;

    public ProxyLocadora(Funcionario funcionario) {
        this.sistemaLocadora = new SistLocadora();
        this.funcionario = funcionario;
    }

    private boolean isGerente() {
        return "Gerente".equalsIgnoreCase(funcionario.getCargo());
    }

    public void cadastrarCliente(Cliente cliente) {
        if (isGerente()) {
            sistemaLocadora.cadastrarCliente(cliente);
        } else {
            System.out.println("Acesso negado: Apenas gerentes podem cadastrar clientes.");
        }
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        if (isGerente()) {
            sistemaLocadora.cadastrarFuncionario(funcionario);
        } else {
            System.out.println("Acesso negado: Apenas gerentes podem cadastrar funcionários.");
        }
    }

    public void cadastrarFilme(Filme filme) {
        if (isGerente()) {
            sistemaLocadora.cadastrarFilme(filme);
        } else {
            System.out.println("Acesso negado: Apenas gerentes podem cadastrar filmes.");
        }
    }

    public void registrarLocacao(Locacao locacao) {
        
        sistemaLocadora.registrarLocacao(locacao);
    }

    public void registrarDevolucao(Devolucao devolucao) {
        sistemaLocadora.registrarDevolucao(devolucao);
    }

    public void listarFilmes() {
        sistemaLocadora.listarFilmes();
    }
}