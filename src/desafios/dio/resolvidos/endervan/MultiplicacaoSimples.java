package desafios.dio.resolvidos.endervan;

import java.util.Scanner;

public class MultiplicacaoSimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        A = sc.nextInt();
        B = sc.nextInt();

        PROD = A*B   ; //implemente o códico que representa a multiplicação.

        System.out.println("PROD = " + PROD);

        sc.close();

    }

}
