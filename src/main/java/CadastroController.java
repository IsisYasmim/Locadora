import java.util.Date;

public class CadastroController {
    private Cadastro modeloCadastro;
    private iView view;

    public CadastroController(Cadastro modeloCadastro, iView view) {
        this.modeloCadastro = modeloCadastro;
        this.view = view;
    }

    public int getIdCadastro() {
        return modeloCadastro.getIdCadastro();
    }

    public String getNome() {
        return modeloCadastro.getNome();
    }

    public String getEndereco() {
        return modeloCadastro.getEndereco();
    }

    public String getTelefone() {
        return modeloCadastro.getTelefone();
    }

    public String getEmail() {
        return modeloCadastro.getEmail();
    }

    public String getCpf() {
        return modeloCadastro.getCpf();
    }

    public Date getDataNascimento() {
        return modeloCadastro.getDataNascimento();
    }

    public void setIdCadastro(int id) {
        modeloCadastro.setIdCadastro(id);
    }

    public void setNome(String nome) {
        modeloCadastro.setNome(nome);
    }

    public void setEndereco(String endereco) {
        modeloCadastro.setEndereco(endereco);
    }

    public void setTelefone(String telefone) {
        modeloCadastro.setTelefone(telefone);
    }

    public void setEmail(String email) {
        modeloCadastro.setEmail(email);
    }

    public void setCpf(String cpf) {
        modeloCadastro.setCpf(cpf);
    }

    public void setDataNascimento(Date dataNascimento) {
        modeloCadastro.setDataNascimento(dataNascimento);
    }

    public void visualizarDetalhes() {
        view.visualizarDetalhes();
    }
}
