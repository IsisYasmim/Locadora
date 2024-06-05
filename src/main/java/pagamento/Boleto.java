package pagamento;

public class Boleto implements Pagamento {

    public void pagar(float valor) {
        System.out.println("Pagamento de R$"+ valor +" feito por boleto");
    }

}