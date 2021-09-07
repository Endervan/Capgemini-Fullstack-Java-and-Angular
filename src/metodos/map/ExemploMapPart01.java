package metodos.map;

import com.sun.source.doctree.SeeTree;

import javax.crypto.spec.PSource;
import java.security.cert.CollectionCertStoreParameters;
import java.util.*;

public class ExemploMapPart01 {

    public static void main(String[] args) {

        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos");

        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Kwid", 13.4);
            put("h20", 19.4);
        }};

        System.out.println(carrosPopulares.toString());

        carrosPopulares.put("gol", 15.6);
        System.out.println("Substituar valor gol para 15.6 ::" + carrosPopulares);

        System.out.println("Confirar se modelo Uno esta no dicionario :: " + carrosPopulares.containsKey("gol"));
        System.out.println("Exiba o consumo do uno :: " + carrosPopulares.get("Uno"));

//        System.out.println("Exiba o terceiro modelo adicionado");

        Set<String> modelos = carrosPopulares.keySet(); // apenas os carros
        System.out.println("Exiba os modelos " + modelos);

        System.out.println("Exiba os CONSUMOS DOS CARROS " + carrosPopulares.values()); // apenas os valores

        System.out.println("Exiba carro o modelo mais eficiente ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();// trabalhar com chave e valores separadamente
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("modelo mais eficiente : " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("Exiba carro o modelo menos eficiente ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos " + soma);


        System.out.println("Exiba a media dos consumos " + (soma / carrosPopulares.size()));


        carrosPopulares.values().removeIf(aDouble -> aDouble.equals(15.6));
        System.out.println("Remova os modelos com consumo igual a 15,6 km/l "+ carrosPopulares);
        // ouuuuuuuuuu
//        while (iterator1.hasNext()) {
//            if (iterator1.next().equals(15.6)) iterator1.remove();
//        }

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{ // ordem de inserção
            put("Gol", 14.4);
            put("Uno", 15.6);
            put("Mobi", 16.1);
            put("Kwid", 13.4);
            put("H20", 19.4);
        }};
        System.out.println("Exibar todos os carros na ordem que foram informadas " + carrosPopulares1);


        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);// ordena chaves ordem alfabetica

        System.out.println("Exiba o dicionario na ordem pelo modelo " + carrosPopulares2 );

        carrosPopulares.clear();
        System.out.println("Apague o dicionario de carros " + carrosPopulares);
        System.out.println("Confira se o dicionario esta vazio " + carrosPopulares.isEmpty());
    }
}
