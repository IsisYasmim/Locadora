public class FuncionarioController {
    private Funcionario modeloFuncionario;
    private iView view;

    public FuncionarioController(Funcionario modeloFuncionario, iView view) {
        this.modeloFuncionario = modeloFuncionario;
        this.view = view;
    }

    public int getIdFuncionario() {
        return modeloFuncionario.getIdFuncionario();
    }

    public String getNome() {
        return modeloFuncionario.getNome();
    }

    public String getEndereco() {
        return modeloFuncionario.getEndereco();
    }

    public String getTelefone() {
        return modeloFuncionario.getTelefone();
    }

    public String getEmail() {
        return modeloFuncionario.getEmail();
    }

    public void setIdFuncionario(int id) {
        modeloFuncionario.setIdFuncionario(id);
    }

    public void setNome(String nome) {
        modeloFuncionario.setNome(nome);
    }

    public void setEndereco(String endereco) {
        modeloFuncionario.setEndereco(endereco);
    }

    public void setTelefone(String telefone) {
        modeloFuncionario.setTelefone(telefone);
    }

    public void setEmail(String email) {
        modeloFuncionario.setEmail(email);
    }

    public void visualizarDetalhes() {
        view.visualizarDetalhes();
    }
}
