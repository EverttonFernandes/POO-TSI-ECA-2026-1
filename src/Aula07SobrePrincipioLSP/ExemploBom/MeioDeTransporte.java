package Aula07SobrePrincipioLSP.ExemploBom;

public abstract class MeioDeTransporte {
    protected String nomeDoMeioDeTransporte;
    protected String corDoMeioDeTransporte;
    protected String quantidadeDePassageiros;

    protected MeioDeTransporte(String nomeDoMeioDeTransporte, String corDoMeioDeTransporte, String quantidadeDePassageiros) {
        this.nomeDoMeioDeTransporte = nomeDoMeioDeTransporte;
        this.corDoMeioDeTransporte = corDoMeioDeTransporte;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    protected abstract void andar();

    protected abstract void parar();

}
