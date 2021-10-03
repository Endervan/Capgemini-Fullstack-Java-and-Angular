package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Stack => pilhas
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println("Pop Tira Ultimo carro da pilha" + stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println("Peek olha objeto no topo da pilha mas nao remove nao remove" + stackCarros.peek());
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty());



    }
}
