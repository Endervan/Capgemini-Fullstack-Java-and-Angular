package trabalhando.com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdernacaoList {
    // Crie uma lista de gatos com nomes,idades e cor
    // Gato 1 = nome:manu,idade:2,cor:preto
    // Gato 2 = nome:louise,idade:3,cor:branco
    // Gato 1 = nome:lais,idade:11,cor:vermelho

    public static void main(String[] args) {
        List<Gato> meusGato = new ArrayList<>() {{
            add(new Gato("manu", 2, "preto"));
            add(new Gato("jessica", 3, "branco"));
            add(new Gato("lais", 11, "vermelho"));
        }};

        System.out.println("Ordem de inserção " + meusGato);

        System.out.println("Ordem de aleatória ");
        Collections.shuffle(meusGato);
        System.out.println(meusGato);

        System.out.println("Ordem Natural->nome");
        Collections.sort(meusGato);
        System.out.println("Ordem Natural->nome (A-z)" + meusGato);


        System.out.println("Ordem Natural->Idade");
//        Collections.sort(meusGato, new ComparatorIdade());
        /////////// ou //
        meusGato.sort(new ComparatorIdade());
        System.out.println(meusGato);


        System.out.println("====ordem cor ====");
        // Collections.sort(meusGato, new ComparatorCor());
        meusGato.sort(new ComparatorCor());
        System.out.println(meusGato);

        System.out.println("====ordem Nome/Cor/Idade ====");
        // Collections.sort(meusGato, new ComparatorNomeIdadeCor());
        meusGato.sort(new ComparatorNomeIdadeCor());
        System.out.println(meusGato);
    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override // usa toString pra compilador nao mostra resultados binarios
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }

}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}

class ComparatorNomeIdadeCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}


