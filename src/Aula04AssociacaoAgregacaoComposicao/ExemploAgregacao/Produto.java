package Aula04AssociacaoAgregacaoComposicao.ExemploAgregacao;

public class Produto {
    private double preco;
    private String nome;

    public Produto(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
