package AulaPraticaSobreInterfacesEOPrincipioISP.exemploBom;

public class Main {
    public static void main(String[] args) {
        Corolla corolla = new Corolla();
        corolla.abrirTetoSolar();
        corolla.ligarBluetooth();
        corolla.ligarWiFi();
        corolla.acelerar();
        corolla.freiar();
        corolla.buzinar();

        Fusca fusca = new Fusca();
        fusca.acelerar();
        fusca.freiar();
        fusca.buzinar();

        Iphone iphone = new Iphone();
        iphone.ligarBluetooth();
        iphone.ligarWiFi();
        iphone.desligarWiFi();
    }
}
