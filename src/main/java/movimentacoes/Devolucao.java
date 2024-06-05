package movimentacoes;
import pagamento.Pagamento;

public class Devolucao {

    private Locacao locacao;
    private Pagamento pagamento;

    public Devolucao(Locacao locacao) {
        this.locacao = locacao;
    }
    
    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }
    
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void pagar() {
        pagamento.pagar(locacao.getExemplar().getValor());
    }

    public void devolver() {
        locacao.getExemplar().devolver();
        pagar();
    }

}