package Aula07SobrePrincipioLSP.ExemploBom;

public abstract class MeioDeTransporteAquatico extends MeioDeTransporte{
    protected MeioDeTransporteAquatico(String nomeDoMeioDeTransporte, String corDoMeioDeTransporte, String quantidadeDePassageiros) {
        super(nomeDoMeioDeTransporte, corDoMeioDeTransporte, quantidadeDePassageiros);
    }
}
