package proxy;
import modelo.Filme;
import movimentacoes.Locacao;

interface Locadora {
    void cadastrarCliente(Cliente cliente);
    void cadastrarFuncionario(Funcionario funcionario);
    void cadastrarFilme(Filme filme);
    void registrarLocacao(Locacao locacao);
    void registrarDevolucao(Locacao locacao);
}