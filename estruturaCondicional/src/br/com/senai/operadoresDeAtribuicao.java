package br.com.senai;

public class operadoresDeAtribuicao {
    public static void main(String[] args) {

        double preco = 21.55;
        System.out.println("Preço: R$" + preco);

        //Todas aparecem o valor de 200
        int x, y, z;
        x = y = z = 200;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Z: " + z);

        
        int j = 10;
        System.out.println("J: " + j);
        j = j + 100;
        System.out.println("J + 100: " + j);
        j += 10;
        System.out.println("J += 10: " + j);

    }
}
