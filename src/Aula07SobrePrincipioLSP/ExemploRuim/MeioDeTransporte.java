package Aula07SobrePrincipioLSP.ExemploRuim;

public abstract class MeioDeTransporte {
    protected String nomeDoMeioDeTransporte;
    protected String corDoMeioDeTransporte;
    protected String quantidadeDePassageiros;

    protected MeioDeTransporte(String nomeDoMeioDeTransporte, String corDoMeioDeTransporte, String quantidadeDePassageiros) {
        this.nomeDoMeioDeTransporte = nomeDoMeioDeTransporte;
        this.corDoMeioDeTransporte = corDoMeioDeTransporte;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    protected abstract void acelerar();

    protected abstract void frear();

    protected abstract void buzinar();

}
