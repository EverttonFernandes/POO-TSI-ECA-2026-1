package Aula08SobreInterfacesEOPrincipioISP.exemploRuim;

public class Fusca extends Veiculo implements Funcionalidades {

    @Override
    protected void acelerar() {
        System.out.println("Acelerando o carro...");
    }

    @Override
    protected void freiar() {
        System.out.println("Freando o carro...");
    }

    @Override
    protected void buzinar() {
        System.out.println("Buzinando o carro...");
    }

    @Override
    public void abrirTetoSolar() {
        throw new UnsupportedOperationException("O Fusca não possui teto solar.");
    }

    @Override
    public void ligarWiFi() {
        throw new UnsupportedOperationException("O Fusca não suporta WiFi.");
    }

    @Override
    public void desligarWiFi() {
        throw new UnsupportedOperationException("O Fusca não suporta WiFi.");
    }

    @Override
    public void conectarBluetooth() {
        throw new UnsupportedOperationException("O Fusca não suporta Bluetooth.");
    }

    @Override
    public void desconectarBluetooth() {
        throw new UnsupportedOperationException("O Fusca não suporta Bluetooth.");
    }
}
