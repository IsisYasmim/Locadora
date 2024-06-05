package modelo;
import estado.Estado;
import estado.Disponivel;

public class Exemplar {

    public int id;
    public float valor;
    private Estado estado;

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Exemplar(int id, float valor) {
        this.id = id;
        this.valor = valor;
        estado = new Disponivel(this);
    }

    public int getCodigo() {
      return id;
    }

    public float getValor() {
      return valor;
    }
  
    public void setCodigo(int id) {
      this.id = id;
    }

    public void setValor(float valor) {
      this.valor = valor;
    }

    public void devolver() {
        estado.devolver();
    }

    public void alugar() {
        estado.alugar();
    }


}
