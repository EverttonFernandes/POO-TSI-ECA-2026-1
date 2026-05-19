package Aula07SobrePrincipioLSP.ExemploBom;

public class Aviao extends MeioDeTransporteAereo{

    protected Aviao(String nomeDoMeioDeTransporte, String corDoMeioDeTransporte, String quantidadeDePassageiros) {
        super(nomeDoMeioDeTransporte, corDoMeioDeTransporte, quantidadeDePassageiros);
    }

    @Override
    protected void andar() {
        System.out.println("Aviao andando...");
    }

    @Override
    protected void voar() {
        System.out.println("Aviao voando...");
    }

    @Override
    protected void aterrizar() {
        System.out.println("Aviao aterrizando...");
    }

    @Override
    protected void parar() {
        System.out.println("O Avião parou!");
    }
}
