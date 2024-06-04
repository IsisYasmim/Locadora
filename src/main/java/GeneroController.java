public class GeneroController {
    private Genero modeloGenero;
    private iView view;

    public GeneroController(Genero modeloGenero, iView view) {
        this.modeloGenero = modeloGenero;
        this.view = view;
    }

    public int getIdGenero() {
        return modeloGenero.getIdGenero();
    }

    public String getNome() {
        return modeloGenero.getNome();
    }

    public String getDescricao() {
        return modeloGenero.getDescricao();
    }

    public void setIdGenero(int id) {
        modeloGenero.setIdGenero(id);
    }

    public void setNome(String nome) {
        modeloGenero.setNome(nome);
    }

    public void setDescricao(String descricao) {
        modeloGenero.setDescricao(descricao);
    }

    public void visualizarDetalhes() {
        System.out.println("Detalhes do Gênero:");
        System.out.println("ID Gênero: " + modeloGenero.getIdGenero());
        System.out.println("Nome: " + modeloGenero.getNome());
        System.out.println("Descrição: " + modeloGenero.getDescricao());
        view.visualizarDetalhes();
    }
}
