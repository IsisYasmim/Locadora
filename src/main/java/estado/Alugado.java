package estado;
import modelo.Exemplar;

public class Alugado implements Estado{
    private Exemplar exemplar;

    public Alugado(Exemplar exemplar) {
        this.exemplar = exemplar;
    }    

    public void alugar() {
        System.out.println("Erro: o exemplar não pode ser alugado");        
    }

    public void devolver() {
        System.out.println("Exemplar devolvido com sucesso");
        exemplar.setEstado(new Disponivel(exemplar));
    }

}