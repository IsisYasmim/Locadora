public class ReservaController {
    private Reserva modeloReserva;
    private iView view;

    public ReservaController(Reserva modeloReserva, iView view) {
        this.modeloReserva = modeloReserva;
        this.view = view;
    }

    //getters
    public int getIdReserva() {
        return modeloReserva.getIdReserva();
    }
    
    public boolean getDisponivel(){
        return modeloReserva.getDisponivel();
    }
    
    //setters
    public void setIdReserva(int id) {
        modeloReserva.setIdReserva(id);
    }

    public void setDisponivel(boolean disponivel){
        modeloReserva.setDisponivel(disponivel);
    }

    
    public void visualizarDetalhes() {
        view.visualizarDetalhes();
    }
}
