package desafios.dio.resolvidos.endervan;

import java.util.Scanner;

public class FatorialMaisSomaTotal {

    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int numero ;
//        numero = sc.nextInt();
//
//        System.out.println("o fatorial " + numero + " e " + factorial(numero));
//    }
//
//    public static final int factorial(int numero) {
//        int fact = 1;
//        for (int i = 1; i <= numero; i++) {
//            fact *= i;
//        }
//        return fact;
//    }

        Scanner sc = new Scanner(System.in);
        int numero = 1;
        numero = sc.nextInt();

//        System.out.println("o fatorial " + numero + " e " + factorial(numero));
        System.out.println(factorial(numero));
    }

    public static final int factorial(int numero) {
        int fact = 1;
        for (int a = numero; a >= 1; a--) {
            fact *= a;
        }
        return fact;
    }

}

