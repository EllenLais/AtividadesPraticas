package br.com.senai;

public class operadoresLogicos {
    public static void main(String[] args) {

        int i = 51;
        int j = 21;
        int valor = 24;

        System.out.println("i >= valor || j >= valor: " + (i >= valor || j >= valor));
        System.out.println("i >= valor && j >= valor: " + (i >= valor && j >= valor));
        System.out.println("!i >= valor: " + (!(i >= valor)));

    }
}
