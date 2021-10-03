package equals.hashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("ford"));
        listaCarros.add(new Carro("onix"));
        listaCarros.add(new Carro("saveiro"));
        listaCarros.add(new Carro("bmw"));

        // contains => verifica se existe
        System.out.println(listaCarros.contains(new Carro("ford")));
        System.out.println(new Carro("ford").hashCode());

        // equals => faz comparação
        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Pampa");
        System.out.println(carro1.equals(carro2));
    }
}
