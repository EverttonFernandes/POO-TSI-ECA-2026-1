package Aula09TratamentoDeExceções.subclasses;

import Aula09TratamentoDeExceções.abstracao.DispositivoEletronico;
import Aula09TratamentoDeExceções.interfaces.ConectaWifi;

public class Smartfone extends DispositivoEletronico implements ConectaWifi {

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

    @Override
    public void ligaWifi() {
        System.out.println("Ligando wifi");
    }
}
