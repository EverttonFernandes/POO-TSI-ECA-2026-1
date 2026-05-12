package Aula05AulaSobreSRPComRefatoracaoGodClass;

public class FinanceiroService {

    private AcademicoService academicoService;
    private RelatorioService relatorioService;

    public FinanceiroService(AcademicoService academicoService, RelatorioService relatorioService) {
        this.academicoService = academicoService;
        this.relatorioService = relatorioService;
    }

    // ===== Pagamentos =====
    public void registrarPagamento(String ra, double valorPago) {
        Aluno aluno = academicoService.validarExistencia(ra);
        if (aluno == null) return;

        aluno.getPagamentos().add(valorPago);
        System.out.println("[PAGAMENTO] RA " + ra + " pagou " + Dinheiro.formatar(valorPago));

        relatorioService.exportarCSV(); // acoplamento proposital (pra perceber e separar depois)
    }

    public StatusPagamento verificarStatusPagamento(String ra, double valorMensalidade) {
        Aluno aluno = academicoService.validarExistencia(ra);
        if (aluno == null) return StatusPagamento.ATRASADO;

        double totalPago = 0;
        for (double valor : aluno.getPagamentos()) totalPago += valor;

        return (totalPago >= valorMensalidade) ? StatusPagamento.EM_DIA : StatusPagamento.ATRASADO;
    }

}
