package teste.java.edvan;

import java.io.IOException;
import java.util.Scanner;

public class HorarioMaxAtraso {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int atraso = 0;

        while (leitor.hasNext()) {

            String[] relogio = leitor.nextLine().split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);

            if (hora == 7) {
                atraso = min;
            }
            if (hora == 8) {
                atraso = min + 60;
            }

            if (hora == 9) {
                atraso = 120;
            }

            switch (hora) {
                case (7): System.out.println("Atraso maximo: " + atraso); break;
                case (8): System.out.println(" Atraso maximo : " +(Integer.parseInt(String.valueOf(atraso)))); break;
                case (9): System.out.println("Atraso maximo : " + (Integer.parseInt(String.valueOf(atraso)))); break;
                default: System.out.println("Atraso maximo: 0");
            }
        }
        leitor.close();
    }
}