package trabalhando.com.collections;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        // lista com 7 notas
        // List notas = new ArrayList(); // antes do java 5
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
       /* List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); // valido somente eh limitado nao poderia adiciona novas notas
        notas.add(10d);
        System.out.println(notas);*/

//        List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        notas.add(1d);
//        notas.remove(5d);
//        System.out.println(notas);


        System.out.println("Crie uma lista e adiciona as setes notas");

//        List<Double> notas = new ArrayList<>(); // generico (jdk 5)
//        //  double == pode ser 7.0 ou 7d
//        notas.add(7.0);
//        notas.add(8.5);
//        notas.add(9.3);
//        notas.add(5.0);
//        notas.add(7.0);
//        notas.add(0.0);
//        notas.add(6.5);
//        System.out.println(notas);
//
//        System.out.println("Exibar posicao da nota 5.0 " + notas.indexOf(5d));
//        System.out.println("Adicione ma Lista a nota 8.0 na  posicao 4 ");
//        notas.add(4, 8.0);
//        System.out.println(notas);
//        System.out.println("Substitua a nota 5.0 por 6.0 ");
//        notas.set(notas.indexOf(5d), 6.0);
//        System.out.println(notas);
//        // contains metodo retorna boolean
//        System.out.println("Conferir se a nota 5.0 esta na Lista " + notas.contains(5d));
////        System.out.println("Exiba todas as notas na ordem que foram informadas");
////        for (Double nota:notas) System.out.println(nota);
//
//        System.out.println("Exiba a terceira nota adicionada " + notas.get(2));
//
//        System.out.println("Exiba a menor nota " + Collections.min(notas));
//
//        System.out.println("Exiba a maior nota " + Collections.max(notas));
//
//
//        Iterator<Double> iterator = notas.iterator();
//        Double soma = 0d;
//        while (iterator.hasNext()) {
//            Double next = iterator.next();
//            soma += next;
//        }
//        System.out.println("Exiba a soma  dos valores " + soma);
//        System.out.println("Exiba a media  dos notas " + (soma / notas.size()));
//
//        System.out.println("Remova a nota zero ");
//        notas.remove(0d);
//        System.out.println(notas);
//
//        System.out.println("Remova a nota da posicão zero");
//        notas.remove(0);
//        System.out.println(notas);
//
//        System.out.println("Remova a notas  menores que 7 e exiba a lista atualizada");
//        Iterator<Double> iterator1 = notas.iterator();
//        while (iterator1.hasNext()) {
//            Double next = iterator1.next();
//            if (next < 7) iterator1.remove();
//        }
//        System.out.println(notas);
//
//        // notas.removeIf(next -> next < 7); // versao generica substitue toda linha comentada de baixo
//        //  Iterator<Double> iterator1 = notas.iterator();
//        // ===  while (iterator1.hasNext()) {
//        //            Double next = iterator1.next();
//        //            if (next < 7) iterator1.remove();
//        //        }
//
//        System.out.println("Apague todas a lista");
//        notas.clear(); // limpando a lista toda
//        System.out.println(notas);
//
//
//       System.out.println("CONFIRAR SE A LISTA ESTA VAZIA " +notas.isEmpty());


        LinkedList<Double> notas1 = new LinkedList<>(); // generico (jdk 5)
        //  double == pode ser 7.0 ou 7d
        notas1.add(8.0);
        notas1.add(9.5);
        notas1.add(5.3);
        notas1.add(1.0);
        notas1.add(3.0);
        notas1.add(0.5);
        notas1.add(5.5);
        System.out.println(notas1);

        System.out.println("Mostre a 1 nota sem remove-la " + notas1.get(0));
        System.out.println("Mostre a 1 nota e remove-la " + notas1.remove(0));
        System.out.println(notas1);

    }
}
