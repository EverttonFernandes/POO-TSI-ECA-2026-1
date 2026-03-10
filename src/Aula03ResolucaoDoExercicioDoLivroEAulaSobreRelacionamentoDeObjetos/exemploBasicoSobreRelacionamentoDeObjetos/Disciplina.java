package Aula03ResolucaoDoExercicioDoLivroEAulaSobreRelacionamentoDeObjetos.exemploBasicoSobreRelacionamentoDeObjetos;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private Professor professor;
    private List<Aluno> listaDeAlunos = new ArrayList<>();
    private String nomeDaDisciplina;

    public Disciplina(Professor professor, List<Aluno> listaDeAlunos, String nomeDaDisciplina) {
        this.professor = professor;
        this.listaDeAlunos = listaDeAlunos;
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    // SOBRECARGA DE MÉTODOS
    public Disciplina(Professor professor, String nomeDaDisciplina) {
        this.professor = professor;
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    public void adicionarAluno(Aluno aluno) {
        this.listaDeAlunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.listaDeAlunos.remove(aluno);
    }

    public void mostrarInformacoesDaDisciplina() {
        System.out.println("############ INFORMAÇÕES DA DISCIPLINA #########");
        System.out.println("Disciplina: " + this.nomeDaDisciplina);
        System.out.println("Professor: " + this.professor.getNome());

        if (this.listaDeAlunos == null || this.listaDeAlunos.size() == 0) {
            System.out.println("Nenhum aluno matriculado nessa disciplina");
        } else {
            System.out.println("Alunos matriculados: ");

            // NOME DISSO É FOREACH
            for (Aluno aluno : this.listaDeAlunos) {
                System.out.println(aluno.getNome());
            }
        }
        System.out.println("Total de alunos matriculados: " + this.listaDeAlunos.size());
    }
}
