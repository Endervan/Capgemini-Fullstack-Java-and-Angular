package desafios.dio.endervan;

import java.util.Scanner;

public class Divisores {
    //complete os espaços em branco com sua solução
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println(n);
    }

}
