package Aula02VisibilidadePublicaPrivadaGettersESetters;

public class Pessoa {
    private String cpf;
    private String rg;
    private String endereco;
    public String nome;

    public Pessoa(String cpf, String rg, String endereco, String nome) {
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
