package br.com.senai;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        String nomeFunc;
        double salarioBruto;

        System.out.print("Digite o nome do funcionário: ");
        nomeFunc = tec.nextLine();
        System.out.print("Digite o salário bruto: R$");
        salarioBruto = tec.nextDouble();

        double inss = (salarioBruto * 9)/100;
        double salarioLiquido = salarioBruto - inss;

        System.out.println("O salário bruto é R$" + salarioBruto);
        System.out.println("O desconto de INSS é R$" + inss);
        System.out.println("O salário líquido é R$" + salarioLiquido);
    }
}
