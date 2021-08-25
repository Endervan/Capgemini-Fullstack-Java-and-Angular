package br.com.digital.innovation;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Suplidores {

    public static void main(String[] args) {
        // Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        // ou
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();

        System.out.println(instanciaPessoa.get());
    }
}

    class Pessoa {
        private String nome;
        private Integer idade;

        public Pessoa() {
            nome = "Ender";
            idade = 34;
        }

        @Override
        public String toString() {
            return String.format("nome : %s , idade: %s", nome, idade);
        }
    }


