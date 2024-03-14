package br.com.senai;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double valor;
        double taxa;
        double diasAtraso;

        System.out.print("Digite o valor da prestação: R$");
        valor = tec.nextDouble();
        System.out.print("Digite a taxa de juros: ");
        taxa = tec.nextDouble();
        System.out.print("Digite o número de dias em atraso: ");
        diasAtraso = tec.nextDouble();

        double prestacao = valor + (valor * (taxa/100) * diasAtraso);
        System.out.println("O valor corrigido da prestação é de: R$" + prestacao);

    }
}
