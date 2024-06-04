public class CargoController {
    private Cargo modeloCargo;
    private iView view;

    public CargoController(Cargo modeloCargo, iView view) {
        this.modeloCargo = modeloCargo;
        this.view = view;
    }

    public int getIdCargo() {
        return modeloCargo.getIdCargo();
    }

    public String getDescricao() {
        return modeloCargo.getDescricao();
    }

    public void setIdCargo(int id) {
        modeloCargo.setIdCargo(id);
    }

    public void setDescricao(String descricao) {
        modeloCargo.setDescricao(descricao);
    }

    public void visualizarDetalhes() {
        view.visualizarDetalhes();
    }
}
