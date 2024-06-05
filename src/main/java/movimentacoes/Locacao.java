package movimentacoes;
import modelo.Exemplar;
import pessoa.Cliente;
import pessoa.Funcionario;

public class Locacao {

    private Exemplar exemplar;
    private Cliente cliente;

    public Locacao(Exemplar exemplar, Cliente cliente) {
        this.exemplar = exemplar;
        this.exemplar.setLocador(cliente);
    }
    
    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Cliente getCliente() {
        return cliente;
    }
    

    public void alugar() {
        exemplar.alugar();
    }
}