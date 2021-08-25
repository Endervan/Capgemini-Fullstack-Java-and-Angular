package br.com.digital.innovation;

import java.util.function.Consumer;

public class Consumidores {

    public static void main(String[] args) {
//        Consumer<String> imprimirUmaFrase = System.out::println;
        Consumer<String> imprimirUmaFrase = frase -> System.out.println (frase);

        imprimirUmaFrase.accept("hello mundo !!");

    }


}
