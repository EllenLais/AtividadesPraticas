package br.com.senai;

import java.util.Scanner;

public class atividadePratica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diametroDoCirculo;
        double raio;
        double area;

        System.out.println("Digite o diâmetro do seu círculo: ");
        diametroDoCirculo = sc.nextInt();

        raio= diametroDoCirculo/2;
        System.out.println("Valor do raio é de: " + raio);

        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área é de: " + area);


    }
}
