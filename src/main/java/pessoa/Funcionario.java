package pessoa;


public class Funcionario extends Pessoa {
    private String cargo;

    public Funcionario(String nome, String cpf, String email, String cargo) {
        super(nome, cpf, email);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}