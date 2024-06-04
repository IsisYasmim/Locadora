public class FilmeController {
    private Filme modeloFilme;
    private iView view;

    public FilmeController(Filme modeloFilme, iView view) {
        this.modeloFilme = modeloFilme;
        this.view = view;
    }

    public int getIdFilme() {
        return modeloFilme.getIdFilme();
    }

    public String getNome() {
        return modeloFilme.getNome();
    }

    public int getAnoLancamento() {
        return modeloFilme.getAnoLancamento();
    }

    public boolean getDisponivel() {
        return modeloFilme.getDisponivel();
    }

    public String getClassificacaoIndicativa() {
        return modeloFilme.getClassificacaoIndicativa();
    }

    public void setIdFilme(int id) {
        modeloFilme.setIdFilme(id);
    }

    public void setNome(String nome) {
        modeloFilme.setNome(nome);
    }

    public void setAnoLancamento(int ano) {
        modeloFilme.setAnoLancamento(ano);
    }

    public void setDisponivel(boolean disponivel) {
        modeloFilme.setDisponivel(disponivel);
    }

    public void setClassificacaoIndicativa(String classificacao) {
        modeloFilme.setClassificacaoIndicativa(classificacao);
    }

    public float getValorMensal() {
        return modeloFilme.getValorMensal();
    }

    public void setValorMensal(float valorMensal) {
        modeloFilme.setValorMensal(valorMensal);
    }

    public void visualizarDetalhes() {
        System.out.println("Detalhes do Filme:");
        System.out.println("ID Filme: " + modeloFilme.getIdFilme());
        System.out.println("Nome: " + modeloFilme.getNome());
        System.out.println("Ano de Lançamento: " + modeloFilme.getAnoLancamento());
        System.out.println("Disponível: " + modeloFilme.getDisponivel());
        System.out.println("Classificação Indicativa: " + modeloFilme.getClassificacaoIndicativa());
        System.out.println("Valor Mensal: " + modeloFilme.getValorMensal());
        view.visualizarDetalhes();
    }
}
