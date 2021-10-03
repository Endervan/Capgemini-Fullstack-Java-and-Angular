package arvores.binarias.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {

    Integer meuValor;

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return meuValor.equals(obj.meuValor);
    }

    @Override
    public int hasCode() {
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int CompareTo(Obj outro) {
        int i = 0;
        if (this.meuValor > outro.meuValor) {
            i = 1;

        } else if (this.meuValor < outro.meuValor) {
            i = -1;
        }

        return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }

    @Override
    public int compareTo(Obj o) {
        return 0;
    }
}
