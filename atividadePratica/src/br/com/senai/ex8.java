package br.com.senai;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double fixo = 500;
        double qtdSoftwVend;

        System.out.print("Digite a quantidade de Software vendido: ");
        qtdSoftwVend = tec.nextDouble();
        double bonus = qtdSoftwVend * 50;
        double salario = fixo + bonus;

        System.out.println("O salário fixo é: R$" + fixo);
        System.out.println("O valor de bônus é: R$" + bonus);
        System.out.println("O salário total é: R$" + salario);
    }
}
