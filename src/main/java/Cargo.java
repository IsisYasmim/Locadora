public class Cargo {
    private int idCargo;
    private String descricao;

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int id) {
        this.idCargo = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void cadastrarCargo() {
        // Implementar cadastro
    }

    public void atualizarCargo() {
        // Implementar atualização
    }

    public void removerCargo() {
        // Implementar remoção
    }

    public Cargo listarCargo() {
        // Implementar listagem
        return this;
    }
}
