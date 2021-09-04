package trabalhando.com.collections;

import java.util.ArrayList;
import java.util.List;

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

          List<Double> notas = new ArrayList<>(); // generico (jdk 5)
        //  double == pode ser 7.0 ou 7d
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(6.5);
        System.out.println(notas);

        System.out.println("Exibar posicao da nota 5.0 "+ notas.indexOf(5d));
        System.out.println("Adicione ma Lista a nota 8.0 na  posicao 4 ");
        notas.add(4,8.0);
        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 por 6.0 ");
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas);
        // contains metodo retorna boolean
        System.out.println("Conferir se a nota 5.0 esta na Lista "+notas.contains(5d));
//        System.out.println("Exiba todas as notas na ordem que foram informadas");
//        for (Double nota:notas) System.out.println(nota);




    }
}
