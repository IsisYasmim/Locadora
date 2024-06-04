import java.util.Date;

public class Locacao {
    private int idLocacao;
    private int idCadastro;
    private int idFilme;
    private int idFuncionario;
    private Date dataLocacao;
    private Date dataDevolucao;
    private String status;
    //getters
    public int getIdLocacao() {
        return idLocacao;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }    

    public String getStatus() {
        return status;
    }

    //setters
    public void setIdLocacao(int id) {
        this.idLocacao = id;
    }

    public void setDataLocacao(Date data) {
        this.dataLocacao = data;
    }
    
    public void setDataDevolucao(Date data){
        this.dataDevolucao = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void realizarLocacao() {
        // Implementar  cadastro
    }

    public void atualizarLocacao() {
        // Implementaratualização
    }

    public void removerLocacao() {
        // Implementar  remoção
    }

    public Locacao listarLocacao() {
        // Implementarlistagem
        return this;
    }
}
