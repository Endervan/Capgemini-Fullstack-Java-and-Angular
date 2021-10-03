package Queue.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        // add se nao conseguir adicionar retorna error
        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);

        // offer se nao conseguir adicionar nao retorna error
        System.out.println(queueCarros.offer(new Carro("Renault")));
        System.out.println(queueCarros);


        // peek pega primeiro valor da fila mas nao remove
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        // poll pega primeiro valor da fila e remove
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);


        System.out.println(queueCarros.isEmpty());

        // size pega quantidade
        System.out.println(queueCarros.size());


    }
}
