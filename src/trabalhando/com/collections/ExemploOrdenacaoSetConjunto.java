package trabalhando.com.collections;
/*Dadas as seguintes informacoes sobre as minhas séries favoritas,
crie um conjunto e ordene este exibindo por:
nome-genero-tempo de episodio*/

import java.util.*;

public class ExemploOrdenacaoSetConjunto {

    public static void main(String[] args) {

        System.out.println("---Exibir ordem aleatoria----");
        Set<Serie> minhasSeries = new HashSet<>() {{ // HashSet-> ordem aleatoria
            add(new Serie("Boruto", "Infantil", 25));
            add(new Serie("One piece", "Anime", 23));
            add(new Serie("Super Girl", "Fantasia", 40));
        }};

        for (Serie serie : minhasSeries)
            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("---Exibir ordem Inserção----");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{  //LinkedHashSet -> ordem de inserção
            add(new Serie("Boruto", "Infantil", 25));
            add(new Serie("One piece", "Anime", 25));
            add(new Serie("Super Girl", "Fantasia", 40));
        }};
        for (Serie serie : minhasSeries1)
            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());


        System.out.println("---Exibir Natural (Tempo de exibição))----");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie : minhasSeries2)
            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());


        System.out.println("---Exibir Natural (Nome/Gênero/TempoEpisodio))----");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);

        for (Serie serie : minhasSeries3)
            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());


        System.out.println("---Exibir Natural (Gênero))----");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorGenero());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4)
            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());

        System.out.println("---Exibir Natural (Tempo Exibição))----");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie : minhasSeries5)
            System.out.println(serie.getNome() + "-" + serie.getGenero() + "-" + serie.getTempoEpisodio());
    }


    static class Serie implements Comparable<Serie> {
        private String nome;
        private String genero;
        private Integer tempoEpisodio;

        public Serie(String nome, String genero, Integer tempoEpisodio) {
            this.nome = nome;
            this.genero = genero;
            this.tempoEpisodio = tempoEpisodio;
        }

        public String getNome() {
            return nome;
        }

        public String getGenero() {
            return genero;
        }

        public Integer getTempoEpisodio() {
            return tempoEpisodio;
        }

        @Override
        public String toString() {
            return "{" +
                    "nome='" + nome + '\'' +
                    ", genero='" + genero + '\'' +
                    ", tempoEpisodio=" + tempoEpisodio +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
        }

        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, tempoEpisodio);
        }

        @Override
        public int compareTo(Serie serie) {
            int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
            if (tempoEpisodio != 0) return tempoEpisodio;
            return this.getGenero().compareTo(serie.getGenero());
        }
    }


    static class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {
            int nome = s1.getNome().compareTo(s2.getNome());
            if (nome != 0) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;

            return Integer.compare(s1.getTempoEpisodio(), s1.getTempoEpisodio());

        }

    }

    static class ComparatorGenero implements Comparator<Serie>{
        @Override
        public int compare(Serie s1, Serie s2) {
            return s1.getGenero().compareTo(s2.getGenero());
        }
    }


 static class ComparatorTempoEpisodio implements Comparator<Serie>{
        @Override
        public int compare(Serie s1, Serie s2) {
            return s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio());
        }
    }

}

