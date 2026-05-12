package Aula06SobrePrincipioOCP.ExemploBomUsandoOCP;

public class PagamentoCredito extends PagamentoAbstrato{

    private double limiteAtualDoCartaoDeCredito;

    public PagamentoCredito(double limiteAtualDoCartaoDeCredito) {
        this.limiteAtualDoCartaoDeCredito = limiteAtualDoCartaoDeCredito;
    }

    public double getLimiteAtualDoCartaoDeCredito() {
        return limiteAtualDoCartaoDeCredito;
    }

    @Override
    void efetuarPagamento(double valorDoPagamento) {
        // AQUI ENTRA AS REGRAS DE NEGÓCIO PARA PAGAR NO CRÉDITO!
        this.limiteAtualDoCartaoDeCredito -= valorDoPagamento;
        System.out.println("Pagamento efetuado via CRÉDITO no valor de R$ " + valorDoPagamento);
    }
}
