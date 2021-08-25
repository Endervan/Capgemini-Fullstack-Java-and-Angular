package br.com.digital.innovation;


import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalculaODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornaNomeAoContrario.apply("jasmir"));
        System.out.println(converterStringParaInteiroECalculaODobro.apply("20"));

    }


}
