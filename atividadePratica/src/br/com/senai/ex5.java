package br.com.senai;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double custoFabrica;
        double percVendedor;
        double impostos;
        double precoFinal;

        System.out.println("Digite o valor de Fábica deste automóvel: R$");
        custoFabrica = tec.nextInt();
        percVendedor = (25 * custoFabrica)/100;
        impostos = (45 * custoFabrica)/100;
        precoFinal = custoFabrica + percVendedor + impostos;

        System.out.println("Custo de fábrica: R$" + custoFabrica);
        System.out.println("Percentual do revendedor: R$" + percVendedor);
        System.out.println("Impostos: R$" + impostos);
        System.out.println("O preço final é: R$" + precoFinal );




    }
}
