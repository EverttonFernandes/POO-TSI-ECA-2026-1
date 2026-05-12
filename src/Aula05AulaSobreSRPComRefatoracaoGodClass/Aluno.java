package Aula05AulaSobreSRPComRefatoracaoGodClass;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String ra;
    private String nome;
    private String email;
    private Serie serie;
    private List<Double> notas = new ArrayList<>();
    private List<Double> pagamentos = new ArrayList<>();

    public Aluno(String ra, String nome, String email, Serie serie) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.serie = serie;
    }

    // Getters e Setters
    public String getRa() { return ra; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public Serie getSerie() { return serie; }
    public List<Double> getNotas() { return notas; }
    public List<Double> getPagamentos() { return pagamentos; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setSerie(Serie serie) { this.serie = serie; }
}
