package br.com.senai;

import java.beans.Customizer;
import java.util.Scanner;

public class atividadePratica6 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);

        double custoDeFabrica;
        double valorConsumidor;

        System.out.println("Digite o valor do preço de fábrica: R$ ");
        custoDeFabrica = sc.nextInt();
        double porcentagemVendedor = custoDeFabrica * 0.25 ;
        double impostos = custoDeFabrica * 0.45;
        System.out.println("A porcentagem do vendedor é de R$" + porcentagemVendedor);
        System.out.println("O valor dos impostos é de R$" + impostos);

        valorConsumidor = custoDeFabrica + porcentagemVendedor + impostos;
        System.out.println("O valor final do carro é de: R$ " + valorConsumidor); */

        double valorDeVenda = 95360;
        double valorDoImposto = valorDeVenda * 0.45;
        double valorDaComissao = valorDeVenda * 0.25;
        double valorDeFabrica = valorDeVenda - (valorDoImposto + valorDaComissao);

        System.out.println("O valor do veículo: R$" + valorDeVenda);
        System.out.println("Valor sem imposto e sem comissão: R$" + valorDeFabrica);


    }
}
