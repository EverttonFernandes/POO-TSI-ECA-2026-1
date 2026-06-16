package Aula09TratamentoDeExceções.exceptions;

public class BateriaInsuficienteException extends RuntimeException{
    public BateriaInsuficienteException(String message) {
        super(message);
    }
}
