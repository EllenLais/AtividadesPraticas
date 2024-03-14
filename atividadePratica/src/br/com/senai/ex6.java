package br.com.senai;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        double nota1;
        double nota2;
        double nota3;

        System.out.print("Insira a primeira nota: ");
        nota1 = tec.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = tec.nextDouble();
        System.out.print("Digite a terceira nota: ");
        nota3 = tec.nextDouble();

        double prova1 = nota1 * 2/10;
        double prova2 = nota2 * 3/10;
        double prova3 = nota3 * 5/10;
        double media = (prova1 + prova2 + prova3);
        System.out.println("A média final é: " + media);
    }
}
