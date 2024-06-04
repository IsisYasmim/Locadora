public class EstadoController {
    private Estado modeloEstado;
    private iView view;

    public EstadoController(Estado modeloEstado, iView view) {
        this.modeloEstado = modeloEstado;
        this.view = view;
    }

    public int getIdEstado() {
        return modeloEstado.getIdEstado();
    }

    public String getNome() {
        return modeloEstado.getNome();
    }

    public void setIdEstado(int id) {
        modeloEstado.setIdEstado(id);
    }

    public void setNome(String nome) {
        modeloEstado.setNome(nome);
    }

    public void visualizarDetalhes() {
        view.visualizarDetalhes();
    }
}
