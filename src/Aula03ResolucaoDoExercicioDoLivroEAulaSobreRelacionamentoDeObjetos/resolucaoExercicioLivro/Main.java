package Aula03ResolucaoDoExercicioDoLivroEAulaSobreRelacionamentoDeObjetos.resolucaoExercicioLivro;

public class Main {
    // teclado de atalho é psvm + tab
    public static void main(String[] args) {
        // INSTÂNCIA DE OBJETOS ( OU SEJA AQUI ELES REALMENTE GANHAM VIDA)
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, false, 40.00);
        Livro livro2 = new Livro("Pai rico pai pobre", "Robert Kiozaki", 2000, false, 60.00);
        Livro livro3 = new Livro("Harry Potter", "JK Roland", 2003, true, 100.00);

        livro1.exibirInformacoesDoLivroApenasSeOLivroEstiverDisponivel();
        livro2.exibirInformacoesDoLivroApenasSeOLivroEstiverDisponivel();
        livro3.exibirInformacoesDoLivroApenasSeOLivroEstiverDisponivel();
    }
}
