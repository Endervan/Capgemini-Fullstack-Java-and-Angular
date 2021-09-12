package teste.java.endervan;

import java.util.Scanner;

public class MediaGeral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, media;
        A = sc.nextDouble();
        B = sc.nextDouble();

        media = ( A * 3.5 + B*7.5)/11; //complete os espaços em branco com as respectivas variáveis.
        System.out.printf("MEDIA = %.5f%n",media     ); // complete com a variável que representa o resultado da média.
        sc.close();
    }

}
