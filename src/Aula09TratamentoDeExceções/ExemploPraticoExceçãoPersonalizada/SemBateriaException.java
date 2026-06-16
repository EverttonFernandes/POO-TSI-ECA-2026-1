package Aula09TratamentoDeExceções.ExemploPraticoExceçãoPersonalizada;

public class SemBateriaException extends RuntimeException {
    public SemBateriaException(String message) {
        super(message);
    }
}
