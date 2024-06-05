package estado;
import modelo.Exemplar;

public class Disponivel implements Estado {
    private Exemplar exemplar;
  
    public Disponivel(Exemplar exemplar) {
        this.exemplar = exemplar;
    }   
     
    public void alugar() {        
        System.out.println("Filme alugado com sucesso");
        exemplar.setEstado(new Alugado(exemplar));
    }

    public void devolver() {
        System.out.println("Não é possível devolver um filme que está disponível");
    }
    
  
}