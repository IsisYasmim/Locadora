package modelo;
import java.util.ArrayList;

public class Genero {
    private String descricao;
    private ArrayList<Filme> filmes;

    public Genero(String descricao) {
        this.descricao = descricao;
        this.filmes = new ArrayList<Filme>();
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    public void mostrarFilmes(){
        System.out.println("Filmes do gênero " + getDescricao() + ":");
        for (Filme filme : filmes) {
            System.out.println(filme.getNome());
        }
    }
    
}
