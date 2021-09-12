package teste.java.endervan;

import java.util.Scanner;

public class FatorialMaisSomaTotal {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero ;
        numero = sc.nextInt();

        System.out.println("o fatorial " + numero + " e " + factorial(numero));
    }

    public static final int factorial(int numero) {
        int fact = 1;
        for (int i = 1; i <= numero; i++) {
            fact *= i;
        }
        return fact;
    }

}

