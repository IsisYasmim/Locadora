import java.util.Date;

public class Pagamento {
    private int idPagamento;
    private int idCadastro;
    private int idLocacao;
    private float valorLocacao;
    private Date dataEmissao;
    private Date dataVencimento;
    private Date dataPagamento;

    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int id) {
        this.idPagamento = id;
    }

    public int getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(int id) {
        this.idCadastro = id;
    }

    public int getIdLocacao() {
        return idLocacao;
    }

    public void setIdLocacao(int id) {
        this.idLocacao = id;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valor) {
        this.valorLocacao = valor;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date data) {
        this.dataEmissao = data;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date data) {
        this.dataVencimento = data;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date data) {
        this.dataPagamento = data;
    }

    public void realizarPagamento(int idPagamento, int idCadastro, float valorLocacao) {
        // Implementar pagamento
    }

    public void consultarPagamento(int idPagamento) {
        // Implementar  consulta
    }
}
