package Aula04AssociacaoAgregacaoComposicao.ExemploAgregacao;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> listaDeProdutos = new ArrayList<>();

    public CarrinhoDeCompras(ArrayList<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public void adicionarProdutoAoCarrinho(Produto produto) {
        listaDeProdutos.add(produto);
    }

    public void limparCarrinhoDeCompras() {
        listaDeProdutos.clear();
    }

    public void exibirProdutosNoCarrinhoDeCompras() {
        System.out.println("MOSTRANDO PRODUTOS NO CARRINHO DE COMPRAS:");

        if (!this.listaDeProdutos.isEmpty()) {
            for (Produto produto : listaDeProdutos) {
                System.out.println("Produto: " + produto.getNome() + " - Preço: R$" + produto.getPreco());
            }
        } else {
            System.out.println("Carrinho de compras está vazio no momento!");
        }

    }
}
