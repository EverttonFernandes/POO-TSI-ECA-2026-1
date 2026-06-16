package Aula09TratamentoDeExceções.subclasses;

import Aula09TratamentoDeExceções.abstracao.DispositivoEletronico;

public class Tablet extends DispositivoEletronico {

    @Override
    protected void carrega() {
        System.out.printf("Esta carregando");
    }

    @Override
    protected void inicializaSistemaOperacional() {
        System.out.printf("Esta inicializando o SO");
    }

    @Override
    protected void desliga() {
        System.out.println("Vai desligar");
    }
}
