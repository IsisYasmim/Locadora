public class Categoria {
    private int idCategoria;
    private String descricao;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int id) {
        this.idCategoria = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void cadastrarCategoria() {
        // Implementarcadastro
    }

    public void atualizarCategoria() {
        // Implementar atualização
    }

    public void removerCategoria() {
        // Implementar  remoção
    }

    public Categoria listarCategoria() {
        // Implementar listagem
        return this;
    }
}
