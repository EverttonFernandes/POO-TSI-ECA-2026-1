package Aula04AssociacaoAgregacaoComposicao.ExemploAgregacao;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Produto mouse = new Produto(100.00, "Mouse");
        Produto camiseta = new Produto(150.00, "Camiseta");
        Produto arCondicionado = new Produto(3000.00, "Ar condicionado");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(new ArrayList<>(Arrays.asList(mouse, camiseta, arCondicionado)));

        Produto iphone = new Produto(5000.00, "iPhone");
        carrinhoDeCompras.adicionarProdutoAoCarrinho(iphone);
        carrinhoDeCompras.limparCarrinhoDeCompras();
        carrinhoDeCompras.exibirProdutosNoCarrinhoDeCompras();
    }
}
