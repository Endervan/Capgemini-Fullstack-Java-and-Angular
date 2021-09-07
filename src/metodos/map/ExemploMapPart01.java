package metodos.map;

import com.sun.source.doctree.SeeTree;

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
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();// trabalhar com chave e valores
       String modeloMaisEficiente = "";
       for (Map.Entry<String, Double> entry:entries){
           if (entry.getValue().equals(consumoMaisEficiente)) {
               modeloMaisEficiente = entry.getKey();
               System.out.println("modelo mais eficiente : "+ modeloMaisEficiente +" - " + consumoMaisEficiente);
           }
       }

    }
}
