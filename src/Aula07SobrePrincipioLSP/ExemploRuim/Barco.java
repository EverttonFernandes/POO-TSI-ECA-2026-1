package Aula07SobrePrincipioLSP.ExemploRuim;

public class Barco extends MeioDeTransporte {

    protected Barco(String nomeDoMeioDeTransporte, String corDoMeioDeTransporte, String quantidadeDePassageiros) {
        super(nomeDoMeioDeTransporte, corDoMeioDeTransporte, quantidadeDePassageiros);
    }

    @Override
    protected void acelerar() {
        System.out.println("Barco acelerando...");
    }

    @Override
    protected void frear() {
        System.out.println("Barco freando...");
    }

    // NESTE MOMENTO ESTAMOS DESRESPEITANDO O PRINCIPIO LSP, DEVIDO A NÃO RESPEITAR A PRÉ CONDIÇÃO DO MÉTODO BUZINAR!
    @Override
    protected void buzinar() {
        throw new UnsupportedOperationException("O Barco não tem buzina!");
    }
}
