package br.com.senai;

import java.util.Scanner;

public class atividadePratica5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("O valor da soma é de " + soma);
        System.out.println("O valor da subtração é de " + subtracao);
        System.out.println("O valor da multiplicação é de " + multiplicacao);
        System.out.println("O valor da divisão é de " + divisao);




    }
}
