package trabalhando.com.collections;


import java.util.*;

public class ExercicioOrdenacaoSetConjunto {

    public static void main(String[] args) {

        System.out.println("---Exibir ordem aleatoria----");
        Set<CorArcoIris> corArcoIriss = new HashSet<>() {{ // HashSet-> ordem aleatoria
            add(new CorArcoIris(1, "Amarelo"));
            add(new CorArcoIris(2, "Azul"));
            add(new CorArcoIris(3, "Vermelho"));
            add(new CorArcoIris(4, "Violeta"));
            add(new CorArcoIris(5, "Amarelo"));
            add(new CorArcoIris(6, "Amarelo"));

        }};
        System.out.println("Exiba todas as cores ::::");
        for (CorArcoIris cor : corArcoIriss) System.out.println(cor.getCod() + "-" + cor.getCor());

        System.out.println("Quantidades de  cores :::: " + corArcoIriss.size());

        Set<CorArcoIris> corArcoIriss1 = new LinkedHashSet<>() {{ // HashSet-> ordem aleatoria
            add(new CorArcoIris(1, "Amarelo"));
            add(new CorArcoIris(2, "Azul"));
            add(new CorArcoIris(3, "Vermelho"));
            add(new CorArcoIris(4, "Violeta"));
            add(new CorArcoIris(5, "Branco"));
            add(new CorArcoIris(6, "Preto"));

        }};
        System.out.println("Exiba todas as cores em Ordem Inserção::::");
        for (CorArcoIris cor : corArcoIriss1) System.out.println(cor.getCod() + "-" + cor.getCor());

        System.out.println("Exibir ordem alfabetica");
        Set<CorArcoIris> corArcoIrises2 = new TreeSet<>(new ComparatorOrderAlfabetica());
        corArcoIrises2.addAll(corArcoIriss1);
        for (CorArcoIris cor : corArcoIrises2) System.out.println(cor.getCod() + "-" + cor.getCor());




//        System.out.println("Limpa Conjunto " + corArcoIrises2.clear());
//        System.out.println("Conferir se  Conjunto esta vazio " + corArcoIrises2.isEmpty());

    }


    //        System.out.println("---Exibir ordem Inserção----");
//        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{  //LinkedHashSet -> ordem de inserção
//            add(new Serie("Boruto", "Infantil", 25));
//            add(new Serie("One piece", "Anime", 25));
//            add(new Serie("Super Girl", "Fantasia", 40));
//        }};
//        for (Serie serie : minhasSeries1)
//            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
//
//
//        System.out.println("---Exibir Natural (Tempo de exibição))----");
//        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
//        for (Serie serie : minhasSeries2)
//            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
//
//
//        System.out.println("---Exibir Natural (Nome/Gênero/TempoEpisodio))----");
//        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
//        minhasSeries3.addAll(minhasSeries);
//        for (Serie serie : minhasSeries3)
//            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
//
//
//        System.out.println("---Exibir Natural (Gênero))----");
//        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
//        minhasSeries4.addAll(minhasSeries);
//        for (Serie serie : minhasSeries4)
//            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
//
//        System.out.println("---Exibir Natural (Tempo Exibição))----");
//        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
//        minhasSeries5.addAll(minhasSeries);
//        for (Serie serie : minhasSeries5)
//            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
//    }
//
//
    static class CorArcoIris implements Comparable<CorArcoIris> {
        private final Integer cod;
        private final String cor;

        public CorArcoIris(Integer cod, String cor) {
            this.cod = cod;
            this.cor = cor;
        }


        @Override
        public int compareTo(CorArcoIris o) {
            return 0;
        }

        public Integer getCod() {
            return cod;
        }

        public String getCor() {
            return cor;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CorArcoIris that = (CorArcoIris) o;
            return cod.equals(that.cod) && cor.equals(that.cor);
        }

        @Override
        public int hashCode() {
            return Objects.hash(cod, cor);
        }

        @Override
        public String toString() {
            return "CorArcoIris{" +
                    "cod=" + cod +
                    ", cor='" + cor + '\'' +
                    '}';
        }
    }


    static class ComparatorOrderAlfabetica implements Comparator<CorArcoIris> {
        @Override
        public int compare(CorArcoIris o1, CorArcoIris o2) {
            return o1.getCor().compareTo(o2.getCor());
        }
    }


}

