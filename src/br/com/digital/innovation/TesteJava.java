package br.com.digital.innovation;

public class TesteJava {

    public static void main(String[] args) {
        Funcao funcao = valor -> {
            return valor;
        };
        System.out.println(funcao.gerar("ender"));

    }
}

interface Funcao {
    String gerar(String valor); // metodo abstrato ..função interativa
}
