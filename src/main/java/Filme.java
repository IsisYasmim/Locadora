import java.util.ArrayList;
import java.util.List;


public class Filme {
    private int idFilme;
    private String nome;
    private int idGenero;
    private int idCategoria;
    private int anoLancamento;
    private boolean disponivel;
    private String classificacaoIndicativa;
    private float valorMensal;

    private static List<Filme> filmes = new ArrayList<Filme>();

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int id) {
        this.idFilme = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int ano) {
        this.anoLancamento = ano;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacao) {
        this.classificacaoIndicativa = classificacao;
    }

    public float getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(float valorMensal) {
        this.valorMensal = valorMensal;
    }

    private void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    private void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public static void cadastrarFilme(int id, String nome, int ano, boolean disponivel, String classificacao, float valorMensal) {
        Filme filme = new Filme();
        filme.setIdFilme(id);
        filme.setNome(nome);
        filme.setAnoLancamento(ano);
        filme.setDisponivel(disponivel);
        filme.setClassificacaoIndicativa(classificacao);
        filme.setValorMensal(valorMensal);
        filmes.add(filme);
        System.out.println("Filme cadastrado com sucesso: " + filme.getNome());
    }

    public void atualizarFilme() {
        for (int i = 0; i < filmes.size(); i++) {
            Filme filme = filmes.get(i);
            if (filme.getIdFilme() == this.idFilme) {
                filme.setNome(this.nome);
                filme.setIdGenero(this.idGenero);
                filme.setIdCategoria(this.idCategoria);
                filme.setAnoLancamento(this.anoLancamento);
                filme.setDisponivel(this.disponivel);
                filme.setClassificacaoIndicativa(this.classificacaoIndicativa);
                filme.setValorMensal(this.valorMensal);
                System.out.println("Filme atualizado com sucesso: " + this.nome);
                return;
            }
        }
        System.out.println("Filme não encontrado: " + this.idFilme);
    }
   

	public static void removerFilme(String nomeFilme) {
        if(nomeFilme == null || nomeFilme.isEmpty()){
            return;
        }
        for (Filme filme : filmes) {
            if (filme.getNome().equals(nomeFilme)) {
                filmes.remove(filme);
                System.out.println("Filme removido com sucesso: " + nomeFilme);
                return;
            }
        }
        System.out.println("Filme não encontrado: " + nomeFilme);
    }

    public static void listarFilme() {
        System.out.println("\nFilmes do catálogo:");
        for (Filme filme : filmes) {
            System.out.println("ID Filme: " + filme.getIdFilme());
            System.out.println("Nome: " + filme.getNome());
            System.out.println("Ano de Lançamento: " + filme.getAnoLancamento());
            System.out.println("Disponível: " + filme.getDisponivel());
            System.out.println("Classificação Indicativa: " +                             filme.getClassificacaoIndicativa());
            System.out.println("Valor Mensal: " + filme.getValorMensal());
        }
    }

    public static List<Filme> listarTodosFilmes() {
        return new ArrayList<Filme>(filmes);
    }
}
