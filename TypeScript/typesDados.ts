// generic types

function adicionaApendiceALista<T>(array: T[], valor: T) {
    return array.map(() => valor);
}

adicionaApendiceALista(['A', 'B', 'C'], 'd');