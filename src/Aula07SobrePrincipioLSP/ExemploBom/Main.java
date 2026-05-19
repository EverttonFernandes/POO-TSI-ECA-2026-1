package Aula07SobrePrincipioLSP.ExemploBom;

public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Aviao Da Latam", "Branco", "100");
        aviao.andar();
        aviao.voar();
        aviao.aterrizar();
        aviao.parar();
    }
}
