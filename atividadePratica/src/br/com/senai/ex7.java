package br.com.senai;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        final double salarioFixo = 800;
        double valorVendaMes;

        System.out.print("Digite o valor da venda do mês: R$");
        valorVendaMes = tec.nextDouble();
        double comissao = (valorVendaMes * 15)/100;
        double salarioTotal = salarioFixo + comissao;

        System.out.println("O salário fixo é: R$" + salarioFixo);
        System.out.println("O valor de comissão é de: R$" + comissao);
        System.out.println("O salário total é de: R$" + salarioTotal);
    }
}
