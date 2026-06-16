package Aula09TratamentoDeExceções.subclasses;

import Aula09TratamentoDeExceções.abstracao.Veiculo;
import Aula09TratamentoDeExceções.interfaces.Abastecimento;

public class Caminhao extends Veiculo implements Abastecimento {

    @Override
    protected void ligar() {
        System.out.println("Ligando caminhao");
    }

    @Override
    protected void acelerar() {
        System.out.println("Acelerando caminhao");
    }

    @Override
    protected void buzinar() {
        System.out.println("Buzinando");
    }

    @Override
    protected void freiar() {
        System.out.println("Freiando");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastacendo");
    }
}
