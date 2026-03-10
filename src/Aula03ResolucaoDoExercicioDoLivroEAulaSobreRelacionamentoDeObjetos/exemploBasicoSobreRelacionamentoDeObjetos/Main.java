package Aula03ResolucaoDoExercicioDoLivroEAulaSobreRelacionamentoDeObjetos.exemploBasicoSobreRelacionamentoDeObjetos;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("33232323", "12345678900", "Everton");
        Disciplina disciplina = new Disciplina(professor, "Programação Orientada a Objetos");

        Aluno maria = new Aluno("20230001", "12345678901", "Maria");
        Aluno joaozinho = new Aluno("4343434", "3998678901", "Joaozinho");
        Aluno eva = new Aluno("435454434", "3998673401", "Eva");

        disciplina.adicionarAluno(maria);
        disciplina.adicionarAluno(joaozinho);
        disciplina.adicionarAluno(eva);
        disciplina.removerAluno(joaozinho);
        disciplina.mostrarInformacoesDaDisciplina();
    }
}
