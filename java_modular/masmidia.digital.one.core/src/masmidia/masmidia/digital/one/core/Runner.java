package masmidia.masmidia.digital.one.core;

import masmidia.digital.one.core.utils.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(10, 20));
    }
}
