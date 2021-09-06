package trabalhando.com.collections;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class ColecoesComSingularidade {
    //    Exemplo set
    public static void main(String[] args) {
        // dada uma lista com 7 notas de um aluno(7,8.5,9.3,7,0,3.6),faca;

      //  Set notas = new HashSet(); // antes java 5
        // Set<Double> notas = new HashSet<>();

        System.out.println("Crie um conjunto e adicione as notas :");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas);

     //   System.out.println("Exibar a posicao da nota 5.0 :");

       //  System.out.println("Adicione na lista a nota 8.0 na posicao 4::");

       // System.out.println("Substituar a nota 5.0 pela nota 6.0 ::");
        System.out.println("Confiar se  a nota 5.0 esta no conjunto ::" + notas.contains(5d));

       // System.out.println("Exibar a terceira nota adicionada::"); nao faz

        System.out.println("Exibar a menor nota :: " + Collections.min(notas));

        System.out.println("Exibar a maior nota :: "+Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibar a soma dos valores :: " + soma);
        System.out.println("Exibar a media dos valores :: " + (soma/notas.size()));

        System.out.println("Remova a nota 0 ");
        notas.remove(0d);
        System.out.println(notas);

        //  System.out.println("remova a nota na posicao 0"); nao faz


        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println("Remova as notas menores que 7  e exiba a lista " +notas);


        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println("Exiba todas as notas na ordem que foram informadas " +notas2);


        Set<Double> notas3  =  new TreeSet<>(notas2);
        System.out.println("Exiba todas as notas na ordem Crescente " + notas3);

        notas.clear();
        System.out.println("Apagar todo conjunto " + notas2.isEmpty() );


    }
}
