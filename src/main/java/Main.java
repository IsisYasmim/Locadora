import java.util.Date;
import java.util.Scanner;
import modelo.Exemplar;
import modelo.Filme;
import modelo.Genero;
import movimentacoes.Locacao;
import pagamento.Boleto;
import pagamento.Pagamento;
import proxy.Cliente;
import proxy.Funcionario;
import proxy.ProxyLocadora;


public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Funcionario("Carlos", "12345678900", "carlos@example.com", "Gerente");
        Funcionario atendente = new Funcionario("Ana", "09876543211", "ana@example.com", "Atendente");

        ProxyLocadora sistemaLocadoraGerente = new ProxyLocadora(gerente);
        ProxyLocadora sistemaLocadoraAtendente = new ProxyLocadora(atendente);

        Cliente cliente = new Cliente("João", "11223344556", "joao@example.com");
        Genero genero = new Genero("Fantasia");
        Filme filme = new Filme("O Senhor dos Anéis", genero, 2001);
        Exemplar exemplar = new Exemplar(1, 50.0f);
        filme.adicionarExemplar(exemplar);

        sistemaLocadoraGerente.cadastrarCliente(cliente);
        sistemaLocadoraGerente.cadastrarFilme(filme);

        Locacao locacao = new Locacao(exemplar);
        sistemaLocadoraAtendente.registrarLocacao(locacao);

        Pagamento pagamento = new Boleto();
        pagamento.pagar(exemplar.getValor());

        sistemaLocadoraAtendente.registrarDevolucao(locacao);
    }
}





//public class Main {
//    public static void main(String[] args) {

 //   public static void pause() {
 //       System.out.println("\nPressione Enter para continuar...");
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine(); // Aguarda o usuário pressionar Enter
//    }

//}
