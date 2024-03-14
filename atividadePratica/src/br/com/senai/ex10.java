package br.com.senai;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double totalPrest;
        double qtdPrestPagas;
        double valorPrest;

        System.out.print("Digite o total das prestações: ");
        totalPrest = tec.nextDouble();
        System.out.print("Digite a quantidade das prestações pagas: ");
        qtdPrestPagas = tec.nextDouble();
        System.out.print("Digite o valor de cada prestação: ");
        valorPrest = tec.nextDouble();

        double totalPago = qtdPrestPagas * valorPrest;
        double saldoDevedor = valorPrest * (totalPrest - qtdPrestPagas);

        System.out.println("O total pago é de: R$" + totalPago);
        System.out.println("O saldo devedor é de: R$" + saldoDevedor);


    }
}
