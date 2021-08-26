package br.com.digital.innovation;

import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ParaleloStream {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();

        System.out.println("tempo de execução " + (fim - inicio));


         inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).parallel().forEach(num ->fatorial(num));
         fim = System.currentTimeMillis();

        System.out.println("tempo de execução paralelo " + (fim - inicio));

    }

    public static long fatorial(long num) {
        int fat = 0;
        for (int i = 2; i < num; i++) {
            fat *= i;
        }

        return fat;
    }


}
