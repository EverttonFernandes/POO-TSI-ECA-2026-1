package Aula06SobrePrincipioOCP.ExemploBomUsandoOCP;

public class PagamentoPix extends PagamentoAbstrato {
    private String chavePixDestinatario;
    private double saldoAtualDaContaCorrente;

    public PagamentoPix(String chavePixDestinatario, double saldoAtualDaContaCorrente) {
        this.chavePixDestinatario = chavePixDestinatario;
        this.saldoAtualDaContaCorrente = saldoAtualDaContaCorrente;
    }

    @Override
    void efetuarPagamento(double valorDoPagamento) {
        // AQUI ENTRA AS REGRAS DE NEGÓCIO PARA PAGAR NO PIX!
        this.saldoAtualDaContaCorrente -= valorDoPagamento;
        System.out.println("Pagamento efetuado via PIX no valor de R$ " + valorDoPagamento + " para a chave destinataria " + this.chavePixDestinatario);
    }
}
