public class Funcionario {
    private int idFuncionario;
    private int idCidade;
    private int idCargo;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int id) {
        this.idFuncionario = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void cadastrarFuncionario() {
        // Implementar cadastro
    }

    public void atualizarFuncionario() {
        // Implementar  atualização
    }

    public void removerFuncionario() {
        // Implementarremoção
    }

    public Funcionario listarFuncionario() {
        // Implementar  listagem
        return this;
    }
}
