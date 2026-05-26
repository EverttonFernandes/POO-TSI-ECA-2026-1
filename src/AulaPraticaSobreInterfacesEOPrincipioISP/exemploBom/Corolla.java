package AulaPraticaSobreInterfacesEOPrincipioISP.exemploBom;

import AulaPraticaSobreInterfacesEOPrincipioISP.exemploRuim.Veiculo;

public class Corolla extends Veiculo implements TetoSolar, LigarWifi, DesligarWifi, LigarBluetooh {

    @Override
    public void ligarBluetooth() {
        System.out.println("Bluetooth do Corolla ligado.");
    }

    @Override
    public void abrirTetoSolar() {
        System.out.println("Teto solar do Corolla aberto.");
    }

    @Override
    public void ligarWiFi() {
        System.out.println("WiFi do Corolla ligado.");
    }

    @Override
    public void desligarWiFi() {
        System.out.println("WiFi do Corolla desligado.");
    }

    @Override
    protected void acelerar() {
        System.out.println("Acelerando o Corolla...");
    }

    @Override
    protected void freiar() {
        System.out.println("Freando o Corolla...");
    }

    @Override
    protected void buzinar() {
        System.out.println("Buzinando o Corolla...");
    }
}
