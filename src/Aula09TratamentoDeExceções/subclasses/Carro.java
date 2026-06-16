package Aula09TratamentoDeExceções.subclasses;

import Aula09TratamentoDeExceções.abstracao.Veiculo;
import Aula09TratamentoDeExceções.exceptions.BateriaInsuficienteException;
import Aula09TratamentoDeExceções.exceptions.CombustivelInsuficienteException;
import Aula09TratamentoDeExceções.interfaces.Abastecimento;
import Aula09TratamentoDeExceções.interfaces.ConectaWifi;
import Aula09TratamentoDeExceções.interfaces.ConectarBluetooth;

public class Carro extends Veiculo implements ConectaWifi, ConectarBluetooth, Abastecimento {

    private int quantidadeDeCombustivel;
    private int nivelDeBateria;

    public Carro(int quantidadeDeCombustivel, int nivelDeBateria) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
        this.nivelDeBateria = nivelDeBateria;
    }

    public int getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public int getNivelDeBateria() {
        return nivelDeBateria;
    }

    @Override
    protected void ligar() {
        this.validarCombustivel();
        this.validarNivelDeBateria();
        System.out.println("Ligando carro");
    }

    @Override
    protected void acelerar() {
        System.out.println("Acelerando carro");
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
    public void ligaWifi() {
        System.out.println("Conectando no wifi");
    }

    @Override
    public void ligaBluetooth() {
        System.out.println("Liga bluetooth");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo");
    }

    private void validarCombustivel() {
        if (quantidadeDeCombustivel == 0) {
            throw new CombustivelInsuficienteException("Não foi possível ligar o carro, devido ao combustivel ser insuficiente!");
        }
    }

    private void validarNivelDeBateria() {
        if (nivelDeBateria == 0) {
            throw new BateriaInsuficienteException("Não foi possível ligar o carro, devido a bateria estar insuficiente!");
        }
    }
}
