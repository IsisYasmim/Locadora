import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private int idCadastro;
    private int idCidade;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;
    private Date dataNascimento;
    private static List<Cadastro> cadastros = new ArrayList<Cadastro>();

    public int getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(int id) {
        this.idCadastro = id;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setIdCidade(int id) {
        this.idCidade = id;
    }


    public static void realizarCadastro(int id, int idCidade, String nome, String endereco, String telefone, String email, String cpf, Date dataNascimento) {
    Cadastro cadastro = new Cadastro();
    cadastro.setIdCadastro(id);
    cadastro.setIdCidade(idCidade);
    cadastro.setNome(nome);
    cadastro.setEndereco(endereco);
    cadastro.setTelefone(telefone);
    cadastro.setEmail(email);
    cadastro.setCpf(cpf);
    cadastro.setDataNascimento(dataNascimento);
    cadastros.add(cadastro);
        
    System.out.println("Cadastrado com sucesso: " + cadastro.getNome());
}


    public void atualizarCadastro() {
        for (Cadastro cadastro: cadastros){
            if (cadastro.getIdCadastro() == this.idCadastro){
                cadastro.setNome(this.nome);
                cadastro.setEndereco(this.endereco);
                cadastro.setTelefone(this.telefone);
                cadastro.setEmail(this.email);
                cadastro.setCpf(this.cpf);
                cadastro.setDataNascimento(this.dataNascimento);
                cadastro.setIdCidade(this.idCidade);
                System.out.println("Cadastro atualizado com sucesso: " + cadastro.getNome());
            }
        }
    }

    public void removerCadastro(int idCadastro) {
        for (Cadastro cadastro : cadastros) {
            if (cadastro.getIdCadastro() == idCadastro) {
                cadastros.remove(cadastro);
                System.out.println("Cadastro removido com sucesso: " + idCadastro);
                return;
            }
        }
        System.out.println("Cadastro não encontrado: " + idCadastro);
    }

    public static void listarCadastro() {
        System.out.println("\nUsuários Cadastrados:");
        for (Cadastro cadastro : cadastros) {
            System.out.println("ID Cadastro: " + cadastro.getIdCadastro());
            System.out.println("Nome: " + cadastro.getNome());
            System.out.println("Endereço: " + cadastro.getEndereco());
            System.out.println("Telefone: " + cadastro.getTelefone());
            System.out.println("E-mail: " + cadastro.getEmail());
            System.out.println("CPF: " + cadastro.getCpf());
            System.out.println("Data de Nascimento: " + cadastro.getDataNascimento());
        }
    }
}
