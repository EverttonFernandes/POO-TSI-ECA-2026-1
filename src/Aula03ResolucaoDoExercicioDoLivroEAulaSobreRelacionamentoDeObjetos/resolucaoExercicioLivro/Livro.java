package Aula03ResolucaoDoExercicioDoLivroEAulaSobreRelacionamentoDeObjetos.resolucaoExercicioLivro;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    boolean disponivel;
    private double precoDoLivro;

    // ANALOGIA: É COMO SE FOSSE UMA FABRICA PARA CRIAR UM OU MAIS LIVROS
    public Livro(String titulo, String autor, int anoDePublicacao, boolean disponivel, double precoDoLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponivel = disponivel;
        this.precoDoLivro = precoDoLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public double getPrecoDoLivro() {
        return precoDoLivro;
    }

    // Método personalizado
    public void exibirInformacoesDoLivroApenasSeOLivroEstiverDisponivel() {
        if (this.disponivel) {
            System.out.println("######## MOSTRANDO AS INFORMAÇÕES DO LIVRO ########");
            System.out.println("Titulo: " + this.titulo);
            System.out.println("Autor: " + this.autor);
            System.out.println("Ano de publicação: " + this.anoDePublicacao);
            System.out.println("Preço do livro: " + this.precoDoLivro);
            System.out.println("####################################################");
        } else {
            System.out.println("O livro " + this.titulo + " não disponível no estoque!");
        }
    }
}
