package br.com.senai;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int idade;
        double salario;


        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = tec.nextLine();
        System.out.print("Digite a sua idade: ");
        idade = tec.nextInt();
        System.out.print("Digite o seu salário: ");
        salario = tec.nextDouble();

        System.out.println("A nome é: " + nomeCompleto);
        System.out.println("A idade é: " + idade + " anos");
        System.out.println("O salário é: R$" + salario);


    }
}
