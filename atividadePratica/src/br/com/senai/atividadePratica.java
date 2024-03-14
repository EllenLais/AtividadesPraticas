package br.com.senai;

import java.util.Scanner;

public class atividadePratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoDeNascimento;
        int anoAtual = 2024;

        System.out.println("Digite seu ano de nascimento: ");
        anoDeNascimento = sc.nextInt();
        System.out.println("Sua idade será de: " + (anoAtual - anoDeNascimento));

    }
}
