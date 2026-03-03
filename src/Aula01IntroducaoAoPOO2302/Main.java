package Aula01IntroducaoAoPOO2302;


public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindos alunos do TSI e da ECA a disciplina de POO!");
        System.out.println("Vamos criar nosso primeiro objeto, um celular!");

        Celular samsung = new Celular("Samsung", "Galaxy S21", "Preto");
        System.out.println("Marca: " + samsung.marca);
        System.out.println("Modelo: " + samsung.modelo);
        System.out.println("Cor: " + samsung.cor);

        System.out.println("######### AGORA VAMOS CRIAR OUTRO CELULAR #########");
        Celular xiaomi = new Celular("Xiaomi", "Redmi Note 10", "Branco");
        System.out.println("Marca: " + xiaomi.marca);
        System.out.println("Modelo: " + xiaomi.modelo);
        System.out.println("Cor: " + xiaomi.cor);
    }
}