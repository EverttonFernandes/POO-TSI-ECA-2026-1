package Aula09TratamentoDeExceções.ExemploPraticoExceçãoPersonalizada;

public class Iphone {
    private boolean temBateria;

    public Iphone(boolean temBateria) {
        this.temBateria = temBateria;
    }

    public void ligarIphone(){
        if (!temBateria){
            throw new SemBateriaException("Não é possível ligar o iPhone: sem bateria.");
        }
    }
}
