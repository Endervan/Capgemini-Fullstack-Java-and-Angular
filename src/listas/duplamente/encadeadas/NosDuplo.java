package listas.duplamente.encadeadas;

public class NosDuplo<T> {

    private T conteudo;
    private NosDuplo<T> noPoximo;
    private NosDuplo<T> noPrevio;

    public NosDuplo(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NosDuplo<T> getNoPoximo() {
        return noPoximo;
    }

    public void setNoPoximo(NosDuplo<T> noPoximo) {
        this.noPoximo = noPoximo;
    }

    public NosDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NosDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    @Override
    public String toString() {
        return "NosDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }


}
