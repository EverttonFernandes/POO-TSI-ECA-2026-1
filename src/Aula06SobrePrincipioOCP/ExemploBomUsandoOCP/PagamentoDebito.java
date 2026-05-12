package Aula06SobrePrincipioOCP.ExemploBomUsandoOCP;

public class PagamentoDebito extends PagamentoAbstrato {

    @Override
    void efetuarPagamento(double valorDoPagamento) {
        // AQUI ENTRA AS REGRAS DE NEGÓCIO PARA PAGAR NO DÉBITO!
    }
}
