package br.com.digital.innovation;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {

        Calculo SOMA = (a, b) -> a + b;
        Calculo SUBTRACAO = (a, b) -> a - b;
        Calculo MULTIPLICACAO = (a, b) -> a * b;
        Calculo DIVISAO = (a, b) -> a / b;
        System.out.println(executarOperacao(SOMA, 1, 2));
        System.out.println(executarOperacao(SUBTRACAO, 1, 2));
        System.out.println(executarOperacao(MULTIPLICACAO, 1, 2));
        System.out.println(executarOperacao(DIVISAO, 1, 2));
    }

    public static int executarOperacao(Calculo calculo, int a, int b) {

        return calculo.calcular(a, b);
    }

    interface Calculo {
        public int calcular(int a, int b);
    }
}
