package br.com.digital.innovation;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Interacoes {


    public static void main(String[] args) {

        String[] nomes = {"joão", "Paulo", "Ender", "Santos", "Instrutor", "Java"};
        Integer[] numeros = {1, 2, 3, 4, 5, 6};
//        imprimirNomesFiltrados(nomes);
//        imprimirTodosOsNomes(nomes);
        // imprimirDobroDeCadaItemDaLista(numeros);

        List<String> profissoes = new ArrayList<>();
        profissoes.add("desenvolvedor");
        profissoes.add("testeador");
        profissoes.add("Gerente de projetos");
        profissoes.add("Gerente de Qualidade");

        profissoes.stream()
                .filter(profissao-> profissao.startsWith("Gerente"))
                .forEach(System.out::println);
    }

    public static void imprimirNomesFiltrados(String... nomes) {
        String nomesParaImprimir = "";
        for (int i = 0; i < nomes.length; i++)
            if (nomes[i].equals("joão")) {
                nomesParaImprimir += " " + nomes[i];
            }

        System.out.println("usando for " + nomesParaImprimir);


//        String nomesParaImprimirDosStream = Stream.of(nomes)
//                .filter(nome -> nome.equals("joão"))
//                .collect(Collectors.joining());
        //   System.out.println("usando Stream " + nomesParaImprimirDosStream);

    }

    public static void imprimirTodosOsNomes(String... nomes) {
        for (String nome : nomes) {
            System.out.println(nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimir pelo forEach " + nome));
    }

    // Integer...    ===   mesmo ===== Integer[]
    public static void imprimirDobroDeCadaItemDaLista(Integer... numeros) {
        for (Integer numero : numeros) {
            System.out.println(numero * 2);
        }

        // substitue for de cima usando api java Stream
        Stream.of(numeros).map(numero -> numero * 2)
                .forEach(System.out::println);
    }


}
