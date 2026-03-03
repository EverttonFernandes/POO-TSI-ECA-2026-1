package Aula02VisibilidadePublicaPrivadaGettersESetters;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoVirtual = new Scanner(System.in);
        System.out.println("Informe o seu CPF: ");
        String cpfInformadoPeloUsuario = tecladoVirtual.nextLine();

        System.out.println("Informe o seu RG: ");
        String rgInformadoPeloUsuario = tecladoVirtual.nextLine();

        System.out.println("Informe o seu endereço: ");
        String enderecoInformadoPeloUsuario = tecladoVirtual.nextLine();

        System.out.println("Informe o seu nome: ");
        String nomeInformadoPeloUsuario = tecladoVirtual.nextLine();

        Pessoa pessoa = new Pessoa(cpfInformadoPeloUsuario, rgInformadoPeloUsuario, enderecoInformadoPeloUsuario, nomeInformadoPeloUsuario);
        System.out.println("Ola " + pessoa.nome);
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Endereco: " + pessoa.getEndereco());

        System.out.println("Ola " + pessoa.nome + ", agora precisamos alterar o teu endereço: ");

        String novoEndereco = tecladoVirtual.nextLine();
        pessoa.setEndereco(novoEndereco);
        System.out.println("Endereco atualizado: " + pessoa.getEndereco());
    }
}
