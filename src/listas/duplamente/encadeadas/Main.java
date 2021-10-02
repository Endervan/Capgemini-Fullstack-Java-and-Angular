package listas.duplamente.encadeadas;

import listas.duplamente.encadeadas.ListaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> minhaListaDuplaEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaDuplaEncadeada.add("c1");
        minhaListaDuplaEncadeada.add("c2");
        minhaListaDuplaEncadeada.add("3");
        minhaListaDuplaEncadeada.add("c4");
        minhaListaDuplaEncadeada.add("c5");
        minhaListaDuplaEncadeada.add("c6");
        minhaListaDuplaEncadeada.add("c7");

        System.out.println(minhaListaDuplaEncadeada);

        minhaListaDuplaEncadeada.remove(3);
        minhaListaDuplaEncadeada.add(3,"99");

        System.out.println(minhaListaDuplaEncadeada);
    }
}
