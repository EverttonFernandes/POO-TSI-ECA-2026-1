package Aula06SobrePrincipioOCP.ExemploRuimSemOCP;

public class Pagamento {
    private TipoPagamento tipoPagamento;
    private String chavePixDestinatario;
    private double saldoAtualDaContaCorrente;
    private double limiteAtualDoCartaoDeCredito;

    public Pagamento(TipoPagamento tipoPagamento, String chavePixDestinatario, double saldoAtualDaContaCorrente, double limiteAtualDoCartaoDeCredito) {
        this.tipoPagamento = tipoPagamento;
        this.chavePixDestinatario = chavePixDestinatario;
        this.saldoAtualDaContaCorrente = saldoAtualDaContaCorrente;
        this.limiteAtualDoCartaoDeCredito = limiteAtualDoCartaoDeCredito;
    }

    public double getSaldoAtualDaContaCorrente() {
        return saldoAtualDaContaCorrente;
    }

    // REFLEXÃO, PARA CADA TIPO DE PAGAMENTO NOVO DENTRO DO NOSSO SOFTWARE, TERIAMOS QUE CRIAR MAIS UM IF HOJE, E AMANHÃ MAIS UM NOVO IF E ASSIM POR DIANTE!
    public void efetuarPagamento(double valorDoPagamento) {

        if (this.tipoPagamento.equals(TipoPagamento.PIX)) {
            this.saldoAtualDaContaCorrente -= valorDoPagamento;
            System.out.println("Pagamento efetuado via PIX no valor de R$ " + valorDoPagamento + " para a chave destinataria " + this.chavePixDestinatario);
        }

        if (this.tipoPagamento.equals(TipoPagamento.CREDITO)){
            // TERIAMOS QUE TER A REGRA DE NEGÓCIO PARA PAGAR NO CRÉDITO
            System.out.println("Pagamento efetuado via CRÉDITO no valor de R$ " + valorDoPagamento);
        }

        if (this.tipoPagamento.equals(TipoPagamento.DEBITO)){
            // TERIAMOS QUE TER A REGRA DE NEGÓCIO PARA PAGAR NO DÉBITO
            System.out.println("Pagamento efetuado via DÉBITO no valor de R$ " + valorDoPagamento);
        }

        if (this.tipoPagamento.equals(TipoPagamento.BOLETO)){
            // TERIAMOS QUE TER A REGRA DE NEGÓCIO PARA PAGAR NO BOLETO
            System.out.println("Pagamento efetuado via BOLETO no valor de R$ " + valorDoPagamento);
        }
    }
}
