package movimentacoes;
import modelo.Exemplar;

public class Locacao {

    private Exemplar exemplar;

    public Locacao(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
    
    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }
    

    public void alugar() {
        exemplar.alugar();
    }
}