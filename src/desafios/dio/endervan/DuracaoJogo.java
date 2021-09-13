package desafios.dio.endervan;

import java.util.Scanner;

public class DuracaoJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inicio, fim;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        int horas = 0;
        inicio = 1;
        fim = 24;

        if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }else if(horas < 0){
            System.out.print("O JOGO DUROU " + (   fim - inicio       ) + " HORA(S)\n");
        }else if(horas > 24){
            System.out.print("O JOGO DUROU " + (   inicio+fim         ) + " HORA(S)\n");
        }else{
            System.out.print("O JOGO DUROU " +    horas         + " HORA(S)\n");
        }
    }
}
