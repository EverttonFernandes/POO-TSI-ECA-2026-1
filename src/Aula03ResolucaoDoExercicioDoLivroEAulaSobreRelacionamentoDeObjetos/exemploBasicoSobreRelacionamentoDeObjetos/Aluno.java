package Aula03ResolucaoDoExercicioDoLivroEAulaSobreRelacionamentoDeObjetos.exemploBasicoSobreRelacionamentoDeObjetos;

public class Aluno {
    private String matricula;
    private String cpf;
    private String nome;

    public Aluno(String matricula, String cpf, String nome) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
