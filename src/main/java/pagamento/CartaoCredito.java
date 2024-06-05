package pagamento;

public class CartaoCredito implements Pagamento {

    public void pagar(float valor) {
        System.out.println("Pagamento de R$"+ valor +" feito com cartão de crédito");
    }

}