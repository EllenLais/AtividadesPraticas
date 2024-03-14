package br.com.senai;

import java.util.Scanner;

public class atividadePratica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario;
        double salarioMinimo = 1412.00;

        System.out.println("Digite seu salário: R$");
        salario = sc.nextInt();
        System.out.printf("Você recebe %.2f salários mínimos " , (salario / salarioMinimo));

    }
}
