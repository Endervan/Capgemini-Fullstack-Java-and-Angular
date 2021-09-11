package Principais.operações.stream.api;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.function.Function;

public class RefatorandoOrdernacaoMap {

    public static void main(String[] args) {
        System.out.println("----- Ordem Aleatória-------");
        Map<Integer, Contato> agenda = new HashMap<>() {{
            put(1, new Contato("Simba", 5555));
            put(4, new Contato("cami", 1111));
            put(5, new Contato("jon", 2222));
        }};
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        // usando funcao anonima organizado pelo id
//        System.out.println("----- Ordem por Numero-------");
//        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contato>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
//                return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());
//            }
//        });
//
//        System.out.println("----- Ordem por Numero usando compaing-------");
//        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
//                new Function<Map.Entry<Integer, Contato>, Integer>() {
//                    @Override
//                    public Integer apply(Map.Entry<Integer, Contato> cont) {
//                        return cont.getValue().getNumero();
//                    }
//                }
//        ));
//

        System.out.println("----- Ordem por Numero usando Lambada-------");
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome() + " - " + entry.getValue().getNumero());
        }

        System.out.println("----- Ordem por Contato usando Lambada-------");
        Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(Comparator.comparing(
                cont1 -> cont1.getValue().getNome()));
        set1.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry1 : set1) {
            System.out.println(entry1.getKey() + " - " + entry1.getValue().getNome() + " - " + entry1.getValue().getNumero());
        }
    }
}


class Contato {
    private final String nome;
    private final Integer numero;

    public Contato(String nome, Integer numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return nome.equals(contato.nome) && numero.equals(contato.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numero);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}

//class ComparadorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
//
//    @Override
//    public int compare(Map.Entry<Integer, Contato> o1, Map.Entry<Integer, Contato> o2) {
//        return Integer.compare(o1.getValue().getNumero(), o2.getValue().getNumero());
//    }
//}