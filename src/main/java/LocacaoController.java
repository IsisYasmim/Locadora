import java.util.Date;

public class LocacaoController {
    private Locacao modeloLocacao;
    private iView view;

    public LocacaoController(Locacao modeloLocacao, iView view) {
        this.modeloLocacao = modeloLocacao;
        this.view = view;
    }

    public int getIdLocacao() {
        return modeloLocacao.getIdLocacao();
    }

    public Date getDataLocacao(){
        return modeloLocacao.getDataLocacao();
    }

    public Date getDataDevolucao(){
        return modeloLocacao.getDataDevolucao();
    }

    public String getStatus(){
        return modeloLocacao.getStatus();
    }

    public void setIdLocacao(int id) {
        modeloLocacao.setIdLocacao(id);
    }
    
    public void setDataLocacao(Date data){
        modeloLocacao.setDataLocacao(data);
    }

    public void setDataDevolucao(Date data){
        modeloLocacao.setDataDevolucao(data);
    }

    public void setStatus(String status){
        modeloLocacao.setStatus(status);
    }

    public void visualizarDetalhes() {
        view.visualizarDetalhes();
    }
}
