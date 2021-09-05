package trabalhando.com.collections;

import java.util.ArrayList;
import java.util.Collections;
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
