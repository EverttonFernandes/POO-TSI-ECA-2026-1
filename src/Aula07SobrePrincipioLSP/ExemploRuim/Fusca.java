package Aula07SobrePrincipioLSP.ExemploRuim;

public class Fusca extends Carro {

    protected Fusca(String nomeDoMeioDeTransporte, String corDoMeioDeTransporte, String quantidadeDePassageiros) {
        super(nomeDoMeioDeTransporte, corDoMeioDeTransporte, quantidadeDePassageiros);
    }

    // Quando utilizamos o o super, nós estamos FAZENDO EXATAMENTE O MESMO COMPORTAMENTO DA CLASSE PAI!
    @Override
    protected void acelerar() {
        super.acelerar();
    }

    @Override
    protected void frear() {
        super.frear();
    }

    // QUANDO NÃO ESTAMOS UTILIZANDO O SUPER, OU SEJA CRIANDO UM NOVA IMPLEMENTAÇÃO PARA AQUELE COMPORTAMENTO, NÓS...
    // ESTAMOS FAZENDO POLIMORFISMO, OU SEJA, O MESMO COMPORTAMENTO PODE SE MANIFESTAR DE MANEIRAS DIFERENTES!
    @Override
    protected void buzinar() {
        System.out.println("Fusca buzinando do jeito dele!");
    }

    public void exibirInformacoes(){
        System.out.println("Nome do meio de transporte: " + nomeDoMeioDeTransporte);
        System.out.println("Cor do meio de transporte: " + corDoMeioDeTransporte);
        System.out.println("Quantidade de passageiros: " + quantidadeDePassageiros);
    }
}
