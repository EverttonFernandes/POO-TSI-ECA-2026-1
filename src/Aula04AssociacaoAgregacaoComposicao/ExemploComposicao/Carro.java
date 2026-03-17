package Aula04AssociacaoAgregacaoComposicao.ExemploComposicao;

public class Carro {
    private String modelo;
    private String marca;
    private Motor motor;

    public Carro(String modelo, String marca, Motor motor) {
        this.modelo = modelo;
        this.marca = marca;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void exibirInformacoesDoCarro() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Motor: " + motor.getModelo() + " - " + motor.getMarca());
    }
}
