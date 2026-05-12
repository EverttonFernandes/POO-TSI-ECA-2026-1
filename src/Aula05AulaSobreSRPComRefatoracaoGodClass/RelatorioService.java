package Aula05AulaSobreSRPComRefatoracaoGodClass;

public class RelatorioService {

    private AlunoRepositorio alunoRepositorio;

    private AcademicoService academicoService;

    public RelatorioService(AlunoRepositorio alunoRepositorio, AcademicoService academicoService) {
        this.alunoRepositorio = alunoRepositorio;
        this.academicoService = academicoService;
    }

    public void exportarCSV() {
        System.out.println("[EXPORT] alunos.csv");
        for (Aluno aluno : alunoRepositorio.listarTodos()) {
            double media = academicoService.calcularMedia(aluno.getRa());
            System.out.println(
                    aluno.getRa() + ";" +
                            aluno.getNome() + ";" +
                            aluno.getEmail() + ";" +
                            aluno.getSerie() + ";" +
                            media
            );
        }
    }
}
