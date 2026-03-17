package Aula04AssociacaoAgregacaoComposicao.ExemploComposicao;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor("AP 2.0", "Audi");
        Carro carro = new Carro("Audi A3", "Audi", motor);

        System.out.println("EXIBINDO INFORMAÇÕES DO CARRO");
        carro.exibirInformacoesDoCarro();
    }
}
