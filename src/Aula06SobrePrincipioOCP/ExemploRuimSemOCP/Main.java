package Aula06SobrePrincipioOCP.ExemploRuimSemOCP;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento = new Pagamento(TipoPagamento.PIX, "090.333.421-12", 1000.00, 5000.00);

        pagamento.efetuarPagamento(200.00);
        System.out.println("Saldo atual da conta corrente: R$ " + pagamento.getSaldoAtualDaContaCorrente());
    }
}
