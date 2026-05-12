package Aula06SobrePrincipioOCP.ExemploBomUsandoOCP;

public abstract class PagamentoAbstrato {
    // CLASSES ABSTRATAS TAMBÉM PODEM TER ATRIBUTOS
    // CLASSES ABSTRATAS TAMBÉM PODEM TER CONSTRUTOR
    // CLASSES ABSTRATAS TAMBÉM PODEM TER MÉTODOS CONCRETOS(seria métodos com implementação de código)
    // CLASSES ABSTRATAS PODE TER MÉTODOS ABSTRATOS

    abstract void efetuarPagamento(double valorDoPagamento);

}
