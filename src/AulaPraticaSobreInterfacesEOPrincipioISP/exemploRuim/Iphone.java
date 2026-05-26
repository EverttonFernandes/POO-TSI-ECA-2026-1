package AulaPraticaSobreInterfacesEOPrincipioISP.exemploRuim;

public class Iphone extends DispositivoEletronico implements Funcionalidades {
    @Override
    protected void ligar() {
        System.out.println("Ligando o iPhone...");
    }

    @Override
    protected void desligar() {
        System.out.println("Desligando o iPhone...");
    }

    @Override
    protected void volume() {
        System.out.println("Ajustando o volume do iPhone...");
    }

    @Override
    public void abrirTetoSolar() {
        throw new UnsupportedOperationException("O iPhone não possui teto solar.");
    }

    @Override
    public void ligarWiFi() {
        System.out.println("Ligando o WiFi do iPhone...");
    }

    @Override
    public void desligarWiFi() {
        System.out.println("Desligando o WiFi do iPhone...");
    }

    @Override
    public void conectarBluetooth() {
        System.out.println("Conectando o Bluetooth do iPhone...");
    }

    @Override
    public void desconectarBluetooth() {
        System.out.println("Desconectando o Bluetooth do iPhone...");
    }
}
