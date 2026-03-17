package Aula04AssociacaoAgregacaoComposicao.ExemploAssociacao;

public class Turma {
    private String nomeDaTurma;
    private int quantidadeDeAlunos;
    private String turno;

    public Turma(String nomeDaTurma, int quantidadeDeAlunos, String turno) {
        this.nomeDaTurma = nomeDaTurma;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
        this.turno = turno;
    }

    public String getNomeDaTurma() {
        return nomeDaTurma;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public String getTurno() {
        return turno;
    }
}
