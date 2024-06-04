import java.util.Date;

public class PagamentoController {
    private Pagamento modeloPagamento;
    private iView view;

    public PagamentoController(Pagamento modeloPagamento, iView view) {
        this.modeloPagamento = modeloPagamento;
        this.view = view;
    }

    public int getIdPagamento() {
        return modeloPagamento.getIdPagamento();
    }

    public float getValorLocacao() {
        return modeloPagamento.getValorLocacao();
    }

    public Date getDataEmissao() {
        return modeloPagamento.getDataEmissao();
    }

    public Date getDataVencimento() {
        return modeloPagamento.getDataVencimento();
    }

    public Date getDataPagamento() {
        return modeloPagamento.getDataPagamento();
    }

    public void setIdPagamento(int id) {
        modeloPagamento.setIdPagamento(id);
    }

    public void setValorLocacao(float valor) {
        modeloPagamento.setValorLocacao(valor);
    }

    public void setDataEmissao(Date data) {
        modeloPagamento.setDataEmissao(data);
    }

    public void setDataVencimento(Date data) {
        modeloPagamento.setDataVencimento(data);
    }

    public void setDataPagamento(Date data) {
        modeloPagamento.setDataPagamento(data);
    }

    public void realizarPagamento(int idPagamento, int idCadastro, float valorLocacao) {
        modeloPagamento.realizarPagamento(idPagamento, idCadastro, valorLocacao);
    }

    public void consultarPagamento(int idPagamento) {
        modeloPagamento.consultarPagamento(idPagamento);
    }

    public void visualizarDetalhes() {
        System.out.println("Detalhes do Pagamento:");
        System.out.println("ID Pagamento: " + modeloPagamento.getIdPagamento());
        System.out.println("Valor Locacao: " + modeloPagamento.getValorLocacao());
        System.out.println("Data Emissao: " + modeloPagamento.getDataEmissao());
        System.out.println("Data Vencimento: " + modeloPagamento.getDataVencimento());
        System.out.println("Data Pagamento: " + modeloPagamento.getDataPagamento());
        view.visualizarDetalhes();
    }
}
