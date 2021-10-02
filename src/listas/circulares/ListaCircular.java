package listas.circulares;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public void remove(int index) {
        if (index >= this.tamanhoLista) throw new IndexOutOfBoundsException("o indice e maior que o tamanho da lista");

        No<T> noAuxilar = cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1) {
            this.cauda.setNoProximo(this.cauda.getNoProximo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAuxilar = noAuxilar.getNoProximo();
            }

            noAuxilar.setNoProximo(noAuxilar.getNoProximo().getNoProximo());
        }

        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty()) throw new IndexOutOfBoundsException("A lista esta vazia");
        if (index == 0) return this.cauda;
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size() {
        return this.tamanhoLista;
    }
}
