package br.com.senai;

public class Variavel {
    public static void main(String[] args) {
        //Declaração de variáveis
        int idade = 18;
        int anoDeNascimento = 2005;
        int anoAtual = 2024;
        String nome = "Ellen";

        //Impressão de dados na tela
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de nascimento: " + anoDeNascimento);
        System.out.println("Ano atual: " + anoAtual);
        System.out.println("Idade prevista: " + (anoAtual-anoDeNascimento));

        //############################################################

        double nota1 = 7.5, nota2 = 8, nota3 = 6.5, nota4 = 7.5;
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Nota 4: " + nota4);
    }
}
/* 1 sinal de igual é uma atribuição*/
