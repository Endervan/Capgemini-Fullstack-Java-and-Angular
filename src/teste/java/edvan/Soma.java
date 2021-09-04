package teste.java.edvan;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int A, B, soma;

        A = sc.nextInt();
        B = sc.nextInt();

        soma = A + B     ;  //insira as variáveis corretamente

        System.out.println("SOMA = " +  soma      );

        sc.close();

    }
}
