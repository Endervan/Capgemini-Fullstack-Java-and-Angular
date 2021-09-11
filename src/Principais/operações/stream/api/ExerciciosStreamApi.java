package Principais.operações.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerciciosStreamApi {

    public static <R> void main(String[] args) {

//        List<Character> consoantesMeuNome = Arrays.asList('c', 'm', 'l', 'c', 'v', 'l', 'c', 'n', 't');
//        System.out.println(consoantesMeuNome);

//        Set<String> coresDaBandeiraDoBrasil = new TreeSet<>(Arrays.asList("verde", "amarelo", "azul", "branco"));
//        System.out.println(coresDaBandeiraDoBrasil);
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

////        System.out.println("Imprima todos os elementos dessa lista");
////        numerosAleatorios.forEach(System.out::println);
//
////        System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set");
////        numerosAleatorios.stream()
////                .limit(5)
////                .collect(Collectors.toSet())
////                .forEach(System.out::println);
//
////        System.out.println("Transforme essa lista de string em uma lista de inteiros");
////        List<Integer> collectList = numerosAleatorios.stream()
////                .map(Integer::parseInt)
////                .collect(Collectors.toList());
////        System.out.println(collectList);
//
////        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista");
////        List<Integer> ListParesMaioresQueDois = numerosAleatorios.stream()
////                .map(Integer::parseInt) // transforma list string em Inteiros
////                .filter(i -> (i % 2 == 0 && i > 2))// faz filtro pares maiores que 2
////                .collect(Collectors.toList());
////        System.out.println(ListParesMaioresQueDois);
//
//
////        System.out.println("Mostre a media dos numeros");
////        numerosAleatorios.stream()
////                .mapToInt(Integer::parseInt)  // cada elemento intero para fazer manipulações
////                .average() //
////                .ifPresent(System.out::println);
//
//
////        List<Integer> numerosAleatoriosIntereger = numerosAleatorios.stream()
////                .map(Integer::parseInt)
////                .collect(Collectors.toList());
////        System.out.println(numerosAleatoriosIntereger);
//        //numerosAleatoriosIntereger.removeIf(integer->(integer % 2 != 0));
////        System.out.println("Remova todos os valores impares");
////        System.out.println(numerosAleatoriosIntereger);
////
        List<Integer> numerosAleatoriosIntereger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numerosAleatoriosIntereger);
//        System.out.println("Ignore os 3 primeiros da lista e imprima o restante");
//        List<Integer> removendo3PrimeirosNumeros = numerosAleatoriosIntereger.subList(3, numerosAleatoriosIntereger.size() - 1);
//        System.out.println(removendo3PrimeirosNumeros);

//        numerosAleatoriosIntereger.stream()
//                .skip(3) // remove no caso os 3 primeiros itens da lista
//                .forEach(System.out::println);


//        System.out.println("Retirando numeros repetidos, quantos numeros ficam");
//        TreeSet<Integer> retirandoNumerosRepetidos = new TreeSet<>(numerosAleatoriosIntereger);
//        System.out.println(retirandoNumerosRepetidos);
//
//        System.out.println("Mostre o menor valor");
//        int numeroMinList = numerosAleatoriosIntereger.stream()
//                .mapToInt(n -> n)
//                .min().orElseThrow(NoSuchElementException::new);
//        System.out.println(numeroMinList);

//        System.out.println("Mostra o maior valor");
//        int numeroMaxList = numerosAleatoriosIntereger.stream()
//                .mapToInt(n -> n)
//                .max().orElseThrow(NoSuchElementException::new);
//        System.out.println(numeroMaxList);
//
//        System.out.println("Pegue apenas numeros impares e some");
//        List<Integer> NumeroImparesMaisSoma = Collections.singletonList(
//                numerosAleatorios.stream()
//                        .mapToInt(Integer::parseInt)
//                        .filter(i -> i % 2 != 0)
//                        .sum());
//        System.out.println(NumeroImparesMaisSoma);

//        System.out.println("Mostre a lista na ordem alfabetica");
        System.out.println("Agrupe os valores impares multiplos  de 3 e 5 usando Stream java");
        Map<Object, List<Integer>> collectMultiplosDETresECinco = numerosAleatoriosIntereger.stream()
                .filter(value -> (value % 3 == 0 || value % 5 == 0))
                .sorted() // organiza a lista ordem crescente
                .collect(Collectors.groupingBy(n->(n % 3 == 0 || n % 5 == 0)));
        System.out.println(collectMultiplosDETresECinco);
        // dica .collect(Collectors.groupingBy())


    }
}
