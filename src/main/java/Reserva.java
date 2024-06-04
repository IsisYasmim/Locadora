public class Reserva {
    private int idReserva;
    private int idCadastro;
    private int idFuncionario;
    private int idLocacao;
    private boolean disponivel;
    
    //getters
    public int getIdReserva() {
        return idReserva;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    //setters
    public void setIdReserva(int id) {
        this.idReserva = id;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public void realizarReserva() {
        // Implementar  cadastro
    }

}
