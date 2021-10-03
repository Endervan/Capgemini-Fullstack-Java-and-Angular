package listas.set.HashSet.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // HashSet ⇒ nao preserva ordem de inserção
        Set<Carro> hashSetCarros = new HashSet<>();


        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeo"));

        System.out.println(hashSetCarros);

        // TreeSet => orgnizar lista caso arvore
        Set<Carro> treeSetCaros = new TreeSet<>();
        treeSetCaros.add(new Carro("Ford"));
        treeSetCaros.add(new Carro("Chevrolet"));
        treeSetCaros.add(new Carro("Fiat"));
        treeSetCaros.add(new Carro("Peugeot"));
        treeSetCaros.add(new Carro("Zip"));
        treeSetCaros.add(new Carro("Alfa Romeo"));

        System.out.println(treeSetCaros);


    }
}
