package modelo;
import java.util.ArrayList;

public class Filme{
    private String nome;
    private Genero genero;
    private int anoLancamento;
    private ArrayList<Exemplar> exemplares;

    public Filme(String nome, Genero genero, int anoLancamento){
        this.nome = nome;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.exemplares = new ArrayList<Exemplar>();
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public void adicionarExemplar(Exemplar exemplar){
        exemplares.add(exemplar);
    }
}
