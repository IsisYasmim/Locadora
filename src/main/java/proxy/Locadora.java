package proxy;
import modelo.Filme;
import movimentacoes.Locacao;
import movimentacoes.Devolucao;
import pessoa.Cliente;
import pessoa.Funcionario;

interface Locadora {
    void cadastrarCliente(Cliente cliente);
    void cadastrarFuncionario(Funcionario funcionario);
    void cadastrarFilme(Filme filme);
    void registrarLocacao(Locacao locacao);
    void registrarDevolucao(Devolucao devolucao);
    void listarFilmes();

}