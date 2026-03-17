package Aula04AssociacaoAgregacaoComposicao.ExemploAssociacao;

public class LaboratorioCad {
    private int quantidadeDeComputadores;
    private Turma turma; // ASSOCIAÇÃO ENTRE O LABORATORIO E A TURMA

    public LaboratorioCad(int quantidadeDeComputadores) {
        this.quantidadeDeComputadores = quantidadeDeComputadores;
    }

    public int getQuantidadeDeComputadores() {
        return quantidadeDeComputadores;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
