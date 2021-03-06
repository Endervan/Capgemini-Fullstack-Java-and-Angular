package br.com.digital.innovation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) throws IOException {
        Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converterStringParaInteiroECalculaODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(retornaNomeAoContrario.apply("jasmir"));
        System.out.println(converterStringParaInteiroECalculaODobro.apply("20"));

        String entrada;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        entrada = br.readLine();
        for (int i = 2; i <= Integer.parseInt(entrada); i++) {

            if (i % 2 == 0) {

                System.out.println(i);

            }

        }
    }
}

