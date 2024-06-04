public class CategoriaController {
    private Categoria modeloCategoria;
    private iView view;

    public CategoriaController(Categoria modeloCategoria, iView view) {
        this.modeloCategoria = modeloCategoria;
        this.view = view;
    }

    public int getIdCategoria() {
        return modeloCategoria.getIdCategoria();
    }

    public String getDescricao() {
        return modeloCategoria.getDescricao();
    }

    public void setIdCategoria(int id) {
        modeloCategoria.setIdCategoria(id);
    }

    public void setDescricao(String descricao) {
        modeloCategoria.setDescricao(descricao);
    }

    public void visualizarDetalhes() {
        System.out.println("Detalhes da Categoria:");
        System.out.println("ID Categoria: " + modeloCategoria.getIdCategoria());
        System.out.println("Descrição: " + modeloCategoria.getDescricao());
        view.visualizarDetalhes();
    }
}
