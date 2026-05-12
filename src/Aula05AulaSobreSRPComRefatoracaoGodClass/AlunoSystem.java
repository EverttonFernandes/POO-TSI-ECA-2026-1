package Aula05AulaSobreSRPComRefatoracaoGodClass;

import java.util.ArrayList;
import java.util.List;

// GOD class proposital: várias responsabilidades na mesma classe.
// Objetivo didático: rodar e depois refatorar aplicando SRP.
public class AlunoSystem {

    // ===== Enums =====
//    public enum Serie { PRIMEIRO, SEGUNDO, TERCEIRO }

//    public enum StatusPagamento {
//        EM_DIA("Em dia"), ATRASADO("Atrasado");
//        private final String rotulo;
//        StatusPagamento(String rotulo) { this.rotulo = rotulo; }
//        public String getRotulo() { return rotulo; }
//    }

    // ===== "Banco" em memória com LISTA =====
//    private final List<Aluno> listaDeAlunos = new ArrayList<>();
//
//    // ===== Cadastro =====
//    public void cadastrarAluno(String ra, String nome, String email, Serie serie) {
//        if (buscarAlunoPorRa(ra) != null) {
//            System.out.println("[ERRO] Já existe aluno com RA " + ra);
//            return;
//        }
//        Aluno novoAluno = new Aluno(ra, nome, email, serie);
//        listaDeAlunos.add(novoAluno);
//
//        System.out.println("[CADASTRO] " + nome + " cadastrado na série " + serie);
//        enviarEmail(email, "Bem-vindo(a)!", "Seu cadastro foi criado com sucesso.");
//    }

    // ===== Notas (com sobrecarga) =====
//    public void registrarNota(String ra, double nota) {
//        Aluno aluno = validarExistencia(ra);
//        if (aluno == null) return;
//
//        aluno.getNotas().add(nota);
//        System.out.println("[NOTA] RA " + ra + " recebeu " + nota);
//        gerarBoletim(ra); // acoplado de propósito (pra refatorar depois)
//    }
//
//    // Sobrecarga — aceita int também
//    public void registrarNota(String ra, int notaInteira) {
//        registrarNota(ra, (double) notaInteira);
//    }
//
//    public double calcularMedia(String ra) {
//        Aluno aluno = validarExistencia(ra);
//        if (aluno == null) return 0.0;
//
//        List<Double> notas = aluno.getNotas();
//        if (notas.isEmpty()) return 0.0;
//
//        double soma = 0;
//        for (double n : notas) soma += n;
//        return soma / notas.size();
//    }
//
//    public void gerarBoletim(String ra) {
//        Aluno aluno = validarExistencia(ra);
//        if (aluno == null) return;
//
//        double media = calcularMedia(ra);
//        System.out.println("[BOLETIM] " + aluno.getNome() + " | RA: " + aluno.getRa() + " | Média: " + media);
//
//        if (media < 6.0) {
//            enviarEmail(aluno.getEmail(),
//                    "Atenção ao desempenho",
//                    "Sua média atual é " + media + ". Procure o professor.");
//        }
//    }

//    // ===== Pagamentos =====
//    public void registrarPagamento(String ra, double valorPago) {
//        Aluno aluno = validarExistencia(ra);
//        if (aluno == null) return;
//
//        aluno.getPagamentos().add(valorPago);
//        System.out.println("[PAGAMENTO] RA " + ra + " pagou " + Dinheiro.formatar(valorPago));
//
//        exportarCSV(); // acoplamento proposital (pra perceber e separar depois)
//    }
//
//    public StatusPagamento verificarStatusPagamento(String ra, double valorMensalidade) {
//        Aluno aluno = validarExistencia(ra);
//        if (aluno == null) return StatusPagamento.ATRASADO;
//
//        double totalPago = 0;
//        for (double valor : aluno.getPagamentos()) totalPago += valor;
//
//        return (totalPago >= valorMensalidade) ? StatusPagamento.EM_DIA : StatusPagamento.ATRASADO;
//    }

//    // ===== Relatórios =====
//    public void exportarCSV() {
//        System.out.println("[EXPORT] alunos.csv");
//        for (Aluno aluno : listaDeAlunos) {
//            double media = calcularMedia(aluno.getRa());
//            System.out.println(
//                    aluno.getRa() + ";" +
//                            aluno.getNome() + ";" +
//                            aluno.getEmail() + ";" +
//                            aluno.getSerie() + ";" +
//                            media
//            );
//        }
//    }

    // ===== Notificação =====
//    private void enviarEmail(String destinatario, String assunto, String conteudo) {
//        System.out.println("[EMAIL] Para: " + destinatario + " | " + assunto + " | " + conteudo);
//    }

    // ===== Regras diversas (misturadas de propósito) =====
//    public void registrarAdvertenciaPorFaltaEmAvaliacao(String ra, boolean faltou) {
//        Aluno aluno = validarExistencia(ra);
//        if (aluno == null) return;
//
//        if (faltou) {
//            System.out.println("[OCORRENCIA] RA " + ra + " recebeu advertência por falta em avaliação.");
//            enviarEmail(aluno.getEmail(),
//                    "Advertência registrada",
//                    "Compareça à coordenação para ciência.");
//        }
//    }

    // ===== Auxiliares internos =====
//    private Aluno validarExistencia(String ra) {
//        Aluno aluno = buscarAlunoPorRa(ra);
//        if (aluno == null) {
//            System.out.println("[ERRO] Aluno não encontrado: " + ra);
//        }
//        return aluno;
//    }

//    private Aluno buscarAlunoPorRa(String ra) {
//        for (Aluno aluno : listaDeAlunos) {
//            if (aluno.getRa().equals(ra)) return aluno;
//        }
//        return null;
//    }

    // ===== Entidade simples (mantida aqui dentro de propósito) =====
//    public static class Aluno {
//        private String ra;
//        private String nome;
//        private String email;
//        private Serie serie;
//        private List<Double> notas = new ArrayList<>();
//        private List<Double> pagamentos = new ArrayList<>();
//
//        public Aluno(String ra, String nome, String email, Serie serie) {
//            this.ra = ra;
//            this.nome = nome;
//            this.email = email;
//            this.serie = serie;
//        }
//
//        // Getters e Setters
//        public String getRa() { return ra; }
//        public String getNome() { return nome; }
//        public String getEmail() { return email; }
//        public Serie getSerie() { return serie; }
//        public List<Double> getNotas() { return notas; }
//        public List<Double> getPagamentos() { return pagamentos; }
//
//        public void setNome(String nome) { this.nome = nome; }
//        public void setEmail(String email) { this.email = email; }
//        public void setSerie(Serie serie) { this.serie = serie; }
//    }

    // ===== Utilitário estático (ex.: formatação de dinheiro) =====
//    public static class Dinheiro {
//        public static String formatar(double valor) {
//            return String.format("R$ %.2f", valor);
//        }
//    }

    // ===== MAIN para demonstrar o fluxo =====
//    public static void main(String[] args) {
//        AlunoSystem sistema = new AlunoSystem();
//
//        sistema.cadastrarAluno("2025001", "Ana", "ana@ifsul.edu", Serie.PRIMEIRO);
//        sistema.registrarNota("2025001", 8);
//        sistema.registrarNota("2025001", 4.5);
//        sistema.registrarPagamento("2025001", 250.00);
//
//        StatusPagamento status = sistema.verificarStatusPagamento("2025001", 250.00);
//        System.out.println("Status financeiro: " + status.getRotulo());
//
//        sistema.registrarAdvertenciaPorFaltaEmAvaliacao("2025001", true);
//        sistema.exportarCSV();
//    }
}
