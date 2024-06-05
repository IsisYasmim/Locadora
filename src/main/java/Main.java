import java.util.Date;
import java.util.Scanner;
import modelo.Exemplar;
import modelo.Filme;
import modelo.Genero;
import movimentacoes.Locacao;
import movimentacoes.Devolucao;
import pagamento.Boleto;
import pagamento.Pagamento;
import pessoa.Cliente;
import pessoa.Funcionario;
import proxy.ProxyLocadora;


public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Funcionario("Carlos", "12345678900", "carlos@example.com", "Gerente");
        Funcionario atendente = new Funcionario("Ana", "09876543211", "ana@example.com", "Atendente");

        ProxyLocadora sistemaLocadoraGerente = new ProxyLocadora(gerente);
        ProxyLocadora sistemaLocadoraAtendente = new ProxyLocadora(atendente);

        Cliente cliente = new Cliente("João", "11223344556", "joao@example.com");

        Genero genero = new Genero("Fantasia");
        Genero generoDrama = new Genero("Drama");
        Genero generoFiccaoCientifica = new Genero("Ficção Científica");
        Genero generoBiografia = new Genero("Biografia");
        
        Filme filme = new Filme("O Senhor dos Anéis", genero, 2001);
        Exemplar exemplar = new Exemplar(1, 50.0f);


  
        filme.adicionarExemplar(exemplar);

        Filme jogosVorazes = new Filme("Jogos Vorazes", generoFiccaoCientifica, 2012);
        Exemplar exemplar2 = new Exemplar(2, 40.0f);
        jogosVorazes.adicionarExemplar(exemplar2);

        Filme extraordinario = new Filme("Extraordinário", generoDrama, 2017);
        Exemplar exemplar3 = new Exemplar(3, 30.0f);
        extraordinario.adicionarExemplar(exemplar3);

        Filme interestelar = new Filme("Interestelar", generoFiccaoCientifica, 2014);
        Exemplar exemplar4 = new Exemplar(4, 45.0f);
        interestelar.adicionarExemplar(exemplar4);

        Filme listaDeSchindler = new Filme("A Lista de Schindler", generoBiografia, 1993);
        Exemplar exemplar5 = new Exemplar(5, 60.0f);
        listaDeSchindler.adicionarExemplar(exemplar5);
        System.out.println("\n================\n");
        sistemaLocadoraAtendente.cadastrarFilme(jogosVorazes);
        sistemaLocadoraAtendente.cadastrarCliente(cliente);

        sistemaLocadoraGerente.cadastrarCliente(cliente);
        sistemaLocadoraGerente.cadastrarFilme(filme);
        sistemaLocadoraGerente.cadastrarFilme(jogosVorazes);
        sistemaLocadoraGerente.cadastrarFilme(extraordinario);
        sistemaLocadoraGerente.cadastrarFilme(interestelar);
        sistemaLocadoraGerente.cadastrarFilme(listaDeSchindler);

        System.out.println("\n================\n");
        Locacao locacao = new Locacao(exemplar, cliente);
        sistemaLocadoraAtendente.registrarLocacao(locacao);

        System.out.println("\n================\n");
        Locacao locacao2 = new Locacao(exemplar, cliente);
        sistemaLocadoraAtendente.registrarLocacao(locacao2);
        System.out.println("\n================\n");
        
        Pagamento pagamento = neSw Boleto();
        Devolucao devolucao = new Devolucao(locacao);
        
        devolucao.setPagamento(pagamento);

        sistemaLocadoraAtendente.registrarDevolucao(devolucao);

        sistemaLocadoraGerente.listarFilmes();

        //cliente.mostrarLocacoes();

    }
}
