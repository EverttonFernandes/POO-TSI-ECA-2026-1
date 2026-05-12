package Aula05AulaSobreSRPComRefatoracaoGodClass;

public class AdvertenciaService {
    private AcademicoService academicoService;

    public AdvertenciaService(AcademicoService academicoService) {
        this.academicoService = academicoService;
    }

    public void registrarAdvertenciaPorFaltaEmAvaliacao(String ra, boolean faltou) {
        Aluno aluno = academicoService.validarExistencia(ra);
        if (aluno == null) return;

        if (faltou) {
            System.out.println("[OCORRENCIA] RA " + ra + " recebeu advertência por falta em avaliação.");
            NotificacaoService.enviarEmail(aluno.getEmail(),
                    "Advertência registrada",
                    "Compareça à coordenação para ciência.");
        }
    }
}
