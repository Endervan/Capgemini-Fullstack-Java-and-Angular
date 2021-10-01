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

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private NosDuplo<T> getNo(int index) {
        NosDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoPoximo();
        }

        return noAuxiliar;
    }

    public int size() {
        return tamanhoLista;
    }
}
