package Aula07SobrePrincipioLSP.ExemploRuim;

public class Main {
    public static void main(String[] args) {
//        Fusca fusca = new Fusca("Fusca", "Azul", "4");
//
//        fusca.exibirInformacoes();
//        fusca.acelerar();
//        fusca.buzinar();
//        fusca.frear();

        // VAMOS FAZER UM EXEMPLO QUE QUEBRE O LSP (PRINCIPIO DE SUBSTITUIÇÃO DE LISKOV)
        Barco barco = new Barco("Barco", "Branco", "10");
        barco.acelerar();
        barco.frear();
        barco.buzinar();
    }
}
