package map.hasMap.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> aluno = new HashMap<>();

        aluno.put("nome","Joao");
        aluno.put("idade","17");
        aluno.put("media","8.5");
        aluno.put("turma","3a");
        System.out.println(aluno);
        // retorna somente as chaves
        System.out.println(aluno.keySet());
        // retorna somente as valores
        System.out.println(aluno.values());


        List<Map<String,String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);

        Map<String,String> aluno2 = new HashMap<>();

        aluno2.put("nome","maria");
        aluno2.put("idade","20");
        aluno2.put("media","9.5");
        aluno2.put("turma","4a");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("nome"));




    }
}
