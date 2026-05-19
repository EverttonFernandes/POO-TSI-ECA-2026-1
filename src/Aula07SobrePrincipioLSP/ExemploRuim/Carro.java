package Aula07SobrePrincipioLSP.ExemploRuim;

public class Carro extends MeioDeTransporte{

    protected Carro(String nomeDoMeioDeTransporte, String corDoMeioDeTransporte, String quantidadeDePassageiros) {
        super(nomeDoMeioDeTransporte, corDoMeioDeTransporte, quantidadeDePassageiros);
    }

    @Override
    protected void acelerar() {
        System.out.println("Carro acelerando...");
    }

    @Override
    protected void frear() {
        System.out.println("Carro freando...");
    }

    @Override
    protected void buzinar() {
        System.out.println("Carro buzinando...");
    }
}
