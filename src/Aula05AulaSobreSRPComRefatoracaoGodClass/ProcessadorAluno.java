package Aula05AulaSobreSRPComRefatoracaoGodClass;

public class ProcessadorAluno {
    private AcademicoService academicoService;
    private FinanceiroService financeiroService;
    private RelatorioService relatorioService;
    private AlunoRepositorio alunoRepositorio;
    private AdvertenciaService advertenciaService;

    public ProcessadorAluno(FinanceiroService financeiroService, RelatorioService relatorioService, AlunoRepositorio alunoRepositorio, AcademicoService academicoService, AdvertenciaService advertenciaService) {
        this.financeiroService = financeiroService;
        this.relatorioService = relatorioService;
        this.alunoRepositorio = alunoRepositorio;
        this.academicoService = academicoService;
        this.advertenciaService = advertenciaService;
    }

    public AdvertenciaService getAdvertenciaService() {
        return advertenciaService;
    }

    public AcademicoService getAcademicoService() {
        return academicoService;
    }

    public AlunoRepositorio getAlunoRepositorio() {
        return alunoRepositorio;
    }

    public FinanceiroService getFinanceiroService() {
        return financeiroService;
    }

    public RelatorioService getRelatorioService() {
        return relatorioService;
    }
}
