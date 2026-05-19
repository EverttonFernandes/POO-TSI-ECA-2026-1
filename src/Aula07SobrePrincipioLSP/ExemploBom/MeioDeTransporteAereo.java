package Aula07SobrePrincipioLSP.ExemploBom;

public abstract class MeioDeTransporteAereo extends MeioDeTransporte {

    protected MeioDeTransporteAereo(String nomeDoMeioDeTransporte, String corDoMeioDeTransporte, String quantidadeDePassageiros) {
        super(nomeDoMeioDeTransporte, corDoMeioDeTransporte, quantidadeDePassageiros);
    }

    protected abstract void voar();

    protected abstract void aterrizar();
}
