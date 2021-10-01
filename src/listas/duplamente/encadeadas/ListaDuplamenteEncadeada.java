package listas.duplamente.encadeadas;

public class ListaDuplamenteEncadeada<T> {

    private NosDuplo<T> primeiroNo;
    private NosDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return tamanhoLista;
    }
}
