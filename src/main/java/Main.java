import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Criação de uma instância de ViewConsole
        ViewConsole viewConsole = new ViewConsole();

        // Criação de instâncias dos modelos
        Pagamento pagamento = new Pagamento();
        pagamento.setIdPagamento(1);
        pagamento.setValorLocacao(150.0f);
        pagamento.setDataEmissao(new Date());
        pagamento.setDataVencimento(new Date());
        pagamento.setDataPagamento(new Date());

        Filme.cadastrarFilme(1, "Jogos Vorazes", 2022, true, "L", 10.0f);
        Filme.cadastrarFilme(2, "Her", 2021, true, "??", 10.0f);

        // Pausa após cadastrar os filmes
        pause();

        Genero genero = new Genero();
        genero.setIdGenero(1);
        genero.setNome("Ação");
        genero.setDescricao("Filmes de ação");

        Categoria categoria = new Categoria();
        categoria.setIdCategoria(1);
        categoria.setDescricao("Filme adaptado de livro");

        // Criação de instâncias dos controladores
        PagamentoController pagamentoController = new PagamentoController(pagamento, viewConsole);
        // FilmeController filmeController = new FilmeController(filme, viewConsole);
        GeneroController generoController = new GeneroController(genero, viewConsole);
        CategoriaController categoriaController = new CategoriaController(categoria, viewConsole);

        // Exibição dos detalhes
        pagamentoController.visualizarDetalhes();
        // filmeController.visualizarDetalhes();
        generoController.visualizarDetalhes();
        categoriaController.visualizarDetalhes();

        pause();
        
        Filme.listarFilme();
        String nomeFilme = "Her";

        System.out.println("\nIremos remover um filme da lista de filmes cadastrados!");
        pause();
        
        Filme.removerFilme(nomeFilme);
        Filme.listarFilme();
    }

    public static void pause() {
        System.out.println("\nPressione Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Aguarda o usuário pressionar Enter
    }
}
