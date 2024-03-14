package br.com.senai;

import java.util.Scanner;

public class atividadePratica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorProd;

        System.out.println("Digite o valor do produto: R$");
        valorProd = sc.nextInt();

        double acrescimo = valorProd * 0.05;
        double valorComAcrescimo = valorProd + acrescimo;
        double valorDaParcela = valorComAcrescimo / 3;
        System.out.println("Valor do produto com 5% de acréscimo " + valorComAcrescimo);
        System.out.println("Valor de cada parcela é de: R$" + valorDaParcela);


        System.out.println("O valor em até 2 parcelas é de: R$ " + valorProd);

        double valorDesconto = valorProd - acrescimo;
        System.out.println("O valor a vista com deconto de 5% é de: R$ " + valorDesconto);




    }
}

