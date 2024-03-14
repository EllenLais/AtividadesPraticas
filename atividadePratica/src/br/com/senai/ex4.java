package br.com.senai;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double numero1;
        double numero2;


        System.out.println("Digite o primeiro número: ");
        numero1 = tec.nextInt();

        System.out.println("Digite o segundo número: ");
        numero2 = tec.nextInt();

        double soma = numero1 + numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;
        double subtracao = numero1 - numero2;

        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Soma = " + soma);


        System.out.printf("\nSoma = %.2f" , soma);
        System.out.printf("\nMultiplicação = %.2f" , multiplicacao);
        System.out.printf("\nDivisão = %.2f" , divisao);
        System.out.printf("\nSubtração = %.2f" , subtracao);

    }
}
