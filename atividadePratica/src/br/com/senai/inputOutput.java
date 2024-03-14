package br.com.senai;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int idade;
        int numero;
        String nomeCompleto;

        System.out.print("Digite a sua idade: ");
        idade = tec.nextInt();
        System.out.print("Digite um número: ");
        numero = tec.nextInt();

        System.out.println("A idade é: " + idade + " anos");
        System.out.println("O número informado foi: " + numero);
        System.out.print("Informe o nome completo: ");
        tec.nextLine();
        nomeCompleto = tec.nextLine();
        System.out.println("O nome é: " + nomeCompleto);

    }
}

