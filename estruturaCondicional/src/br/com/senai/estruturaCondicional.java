package br.com.senai;

public class estruturaCondicional {
    public static void main(String[] args) {
        int idade = 18;

        System.out.println("IF simples");
        if (idade >= 18)
            System.out.println("Maior de idade");
        else
            System.out.println("Menor de idade");

        System.out.println("\nIF com ELSE");
        String nome = "Ellen";
        if (idade >= 18) {
            System.out.println("Nome: " + nome);
            System.out.println("Maior de idade");
        } else {

            System.out.println("A pessoa chamada: " + nome);
            System.out.println("Tem " + idade + " anos de idade");
            System.out.println("Menor de idade");

        }

        System.out.println("\nIF aninhado");
        double valor = 21.5;
        char letra = 's';

        if(valor > 10){
            if (letra == 'j') System.out.println("Letra S");
            if (letra == 's' && valor < 50) System.out.println("Letra S e valor < 50");
            else System.out.println("Letra diferente de S ou valor > 50");
        }

        System.out.println("\nCondição encadeada");
        int idade2 = 18;
        if(idade2 < 14){
            System.out.println("Criança");
        } else if(idade2 <= 14 && idade2 < 18){
            System.out.println("Adolescente");
        } else if(idade2 >= 18 && idade2 < 60){
            System.out.println("Adulto");
        } else if(idade2 >= 60){
            System.out.println("Idoso");
        } else {
            System.out.println("Temporal fora do padrão");
        }

        System.out.println("\n####################");
        if(idade2 < 14){
            System.out.println("Criança");
        } else if(idade2 < 18){
            System.out.println("Adolescente");
        } else if(idade2 < 60){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }

        System.out.println("Sistema encerrado!");
    }
}
