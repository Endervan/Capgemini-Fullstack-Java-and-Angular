package br.com.digital.innovation;

import java.util.HashMap;
import java.util.Map;

public class RecursividadeTailCall {

    static Map<Integer, Integer> MAPA_FACTORIAL = new HashMap<>();

    public static void main(String[] args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemorization(15));
        long F = System.nanoTime();
        System.out.println("fatorial 1 " + (F - I));

        I = System.nanoTime();
        System.out.println(fatorialComMemorization(15));
        F = System.nanoTime();
        System.out.println("fatorial 2 " + (F - I));
    }

    public static Integer fatorialComMemorization(Integer value) {
        if (value == 1) {
            return value;
        } else {
            if (MAPA_FACTORIAL.containsKey(value)) {
                return MAPA_FACTORIAL.get(value);
            } else {
                Integer resultado = value * fatorialComMemorization(value - 1);
                MAPA_FACTORIAL.put(value, resultado);
                return resultado;
            }
        }
    }


}
