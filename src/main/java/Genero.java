import java.util.ArrayList;
import java.util.List;

public class Genero {
    private int idGenero;
    private String nome;
    private String descricao;

    private static List<Genero> generos = new ArrayList<Genero>();

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int id) {
        this.idGenero = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void cadastrarGenero() {
        generos.add(this);
        System.out.println("Gênero cadastrado com sucesso: " + this.nome);
    }

    public void atualizarGenero() {
        for (int i = 0; i < generos.size(); i++) {
            Genero genero = generos.get(i);
            if (genero.getIdGenero() == this.idGenero) {
                genero.setNome(this.nome);
                genero.setDescricao(this.descricao);
                System.out.println("Gênero atualizado com sucesso: " + this.nome);
                return;
            }
        }
        System.out.println("Gênero não encontrado: " + this.idGenero);
    }

    public void removerGenero() {
        for (int i = 0; i < generos.size(); i++) {
            Genero genero = generos.get(i);
            if (genero.getIdGenero() == this.idGenero) {
                generos.remove(i);
                System.out.println("Gênero removido com sucesso: " + this.nome);
                return;
            }
        }
        System.out.println("Gênero não encontrado: " + this.idGenero);
    }

    public Genero listarGenero() {
        for (int i = 0; i < generos.size(); i++) {
            Genero genero = generos.get(i);
            if (genero.getIdGenero() == this.idGenero) {
                return genero;
            }
        }
        return null;
    }

    public static List<Genero> listarTodosGeneros() {
        return new ArrayList<Genero>(generos);
    }
}
