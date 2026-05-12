package Aula06SobrePrincipioOCP.ExemploBomUsandoOCP;

public class Main {
    public static void main(String[] args) {
        PagamentoPix pagamentoPix = new PagamentoPix("090.333.421-12", 1000.00);
        pagamentoPix.efetuarPagamento(200.00);

        PagamentoCredito pagamentoCredito = new PagamentoCredito(5000.00);
        pagamentoCredito.efetuarPagamento(200.00);
        System.out.println("Limite atual do cartão de crédito: R$ " + pagamentoCredito.getLimiteAtualDoCartaoDeCredito());
    }
}
