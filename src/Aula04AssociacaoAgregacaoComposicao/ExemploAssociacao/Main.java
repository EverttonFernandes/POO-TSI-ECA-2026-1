package Aula04AssociacaoAgregacaoComposicao.ExemploAssociacao;

public class Main {
    public static void main(String[] args) {
        Turma turma = new Turma("TSI/ECA", 37, "Noturno");

        LaboratorioCad laboratorioCad = new LaboratorioCad(37);
        laboratorioCad.setTurma(turma);

        System.out.println("Informaçõe do laboratorio");
        System.out.println("Quantidade de computadores: " + laboratorioCad.getQuantidadeDeComputadores());
        System.out.println("Informações da turma associada ao laboratório:");
        System.out.println("Nome da turma: " + laboratorioCad.getTurma().getNomeDaTurma());
        System.out.println("Quantidade de alunos: " + laboratorioCad.getTurma().getQuantidadeDeAlunos());
        System.out.println("Turno: " + laboratorioCad.getTurma().getTurno());
    }
}
