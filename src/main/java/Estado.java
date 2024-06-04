import java.util.ArrayList;
import java.util.List;

public class Estado {
    private int idEstado;
    private String nome;

    private static List<Estado> estados = new ArrayList<Estado>();

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int id) {
        this.idEstado = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarEstado() {
        estados.add(this);
        System.out.println("Estado cadastrado com sucesso: " + this.nome);
    }

    public void atualizarEstado() {
        for (int i = 0; i < estados.size(); i++) {
            Estado estado = estados.get(i);
            if (estado.getIdEstado() == this.idEstado) {
                estado.setNome(this.nome);
                System.out.println("Estado atualizado com sucesso: " + this.nome);
                return;
            }
        }
        System.out.println("Estado não encontrado: " + this.idEstado);
    }

    public void removerEstado() {
        for (int i = 0; i < estados.size(); i++) {
            Estado estado = estados.get(i);
            if (estado.getIdEstado() == this.idEstado) {
                estados.remove(i);
                System.out.println("Estado removido com sucesso: " + this.nome);
                return;
            }
        }
        System.out.println("Estado não encontrado: " + this.idEstado);
    }

    public Estado listarEstado() {
        for (int i = 0; i < estados.size(); i++) {
            Estado estado = estados.get(i);
            if (estado.getIdEstado() == this.idEstado) {
                return estado;
            }
        }
        return null;
    }

    public static List<Estado> listarTodosEstados() {
        return new ArrayList<Estado>(estados);
    }
}
