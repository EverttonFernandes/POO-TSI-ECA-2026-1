package Aula05AulaSobreSRPComRefatoracaoGodClass;

import java.util.List;

public class AcademicoService {

    private AlunoRepositorio alunoRepositorio;

    public AcademicoService(AlunoRepositorio alunoRepositorio) {
        this.alunoRepositorio = alunoRepositorio;
    }

    // ===== Notas (com sobrecarga) =====
    public void registrarNota(String ra, double nota) {
        Aluno aluno = validarExistencia(ra);
        if (aluno == null) return;

        aluno.getNotas().add(nota);
        System.out.println("[NOTA] RA " + ra + " recebeu " + nota);
        gerarBoletim(ra); // acoplado de propósito (pra refatorar depois)
    }

    // Sobrecarga — aceita int também
    public void registrarNota(String ra, int notaInteira) {
        registrarNota(ra, (double) notaInteira);
    }

    public double calcularMedia(String ra) {
        Aluno aluno = validarExistencia(ra);
        if (aluno == null) return 0.0;

        List<Double> notas = aluno.getNotas();
        if (notas.isEmpty()) return 0.0;

        double soma = 0;
        for (double n : notas) soma += n;
        return soma / notas.size();
    }

    public void gerarBoletim(String ra) {
        Aluno aluno = validarExistencia(ra);
        if (aluno == null) return;

        double media = calcularMedia(ra);
        System.out.println("[BOLETIM] " + aluno.getNome() + " | RA: " + aluno.getRa() + " | Média: " + media);

        if (media < 6.0) {
            NotificacaoService.enviarEmail(aluno.getEmail(),
                    "Atenção ao desempenho",
                    "Sua média atual é " + media + ". Procure o professor.");
        }
    }

    public Aluno validarExistencia(String ra) {
        Aluno aluno = alunoRepositorio.buscarAlunoPorRa(ra);
        if (aluno == null) {
            System.out.println("[ERRO] Aluno não encontrado: " + ra);
        }
        return aluno;
    }
}
