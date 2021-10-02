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

    public void add(T element) {
        NosDuplo<T> novoNo = new NosDuplo<>(element);
        novoNo.setNoPoximo(null);
        novoNo.setNoPrevio(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoPoximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getNoPoximo();
            if (primeiroNo != null) {
                primeiroNo.setNoPrevio(null);
            }
        } else {
            NosDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoPoximo(noAuxiliar.getNoPoximo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getNoPoximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar;
            }
        }

        tamanhoLista--;
    }

    public void add(int index, T elemento) {
        NosDuplo<T> noAuxiliar = getNo(index);
        NosDuplo<T> novoNo = new NosDuplo<>(elemento);

        if (novoNo.getNoPoximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
            novoNo.getNoPoximo().setNoPrevio(novoNo);
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoPoximo(novoNo);
        }

        tamanhoLista++;
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

    @Override
    public String toString() {
        String strRetorno = "";

        NosDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo =" + noAuxiliar.getConteudo() + "}]-->";
            noAuxiliar = noAuxiliar.getNoPoximo();

        }

        strRetorno += "null";

        return strRetorno;
    }
}
