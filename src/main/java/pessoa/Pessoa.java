package pessoa;
import movimentacoes.Locacao;
import java.util.ArrayList;
        
abstract class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Locacao> locacoes;
    
    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        locacoes = new ArrayList<Locacao>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void adicionarLocacao(Locacao locacao){
        locacoes.add(locacao);
    }

    public void removerLocacao(Locacao locacao){
        locacoes.remove(locacao);
    }

    public void mostrarLocacoes(){
        
    }
}