public class CidadeController {
    private Cidade modeloCidade;
    private iView view;

    public CidadeController(Cidade modeloCidade, iView view) {
        this.modeloCidade = modeloCidade;
        this.view = view;
    }

    public int getIdCidade() {
        return modeloCidade.getIdCidade();
    }

    public String getNome() {
        return modeloCidade.getNome();
    }

    public void setIdCidade(int id) {
        modeloCidade.setIdCidade(id);
    }

    public void setNome(String nome) {
        modeloCidade.setNome(nome);
    }

    public void visualizarDetalhes() {
        view.visualizarDetalhes();
    }
}
