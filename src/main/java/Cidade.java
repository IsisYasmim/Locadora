import java.util.ArrayList;
import java.util.List;

public class Cidade {
    private int idCidade;
    private int idEstado;
    private String nome;

    private static List<Cidade> cidades = new ArrayList<Cidade>();

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int id) {
        this.idCidade = id;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarCidade() {
        cidades.add(this);
        System.out.println("Cidade cadastrada com sucesso: " + this.nome);
    }

    public void atualizarCidade() {
        for (int i = 0; i < cidades.size(); i++) {
            Cidade cidade = cidades.get(i);
            if (cidade.getIdCidade() == this.idCidade) {
                cidade.setNome(this.nome);
                cidade.setIdEstado(this.idEstado);
                System.out.println("Cidade atualizada com sucesso: " + this.nome);
                return;
            }
        }
        System.out.println("Cidade não encontrada: " + this.idCidade);
    }

    public void removerCidade() {
        for (int i = 0; i < cidades.size(); i++) {
            Cidade cidade = cidades.get(i);
            if (cidade.getIdCidade() == this.idCidade) {
                cidades.remove(i);
                System.out.println("Cidade removida com sucesso: " + this.nome);
                return;
            }
        }
        System.out.println("Cidade não encontrada: " + this.idCidade);
    }

    public Cidade listarCidade() {
        for (int i = 0; i < cidades.size(); i++) {
            Cidade cidade = cidades.get(i);
            if (cidade.getIdCidade() == this.idCidade) {
                return cidade;
            }
        }
        return null;
    }

    public static List<Cidade> listarTodasCidades() {
        return new ArrayList<Cidade>(cidades);
    }
}
