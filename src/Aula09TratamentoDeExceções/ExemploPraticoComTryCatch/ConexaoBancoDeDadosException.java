package Aula09TratamentoDeExceções.ExemploPraticoComTryCatch;

public class ConexaoBancoDeDadosException extends RuntimeException {
    public ConexaoBancoDeDadosException(String message) {
        super(message);
    }
}
