interface Cachorro {
    nome: string;
    idade: number;
    parqueFavorito?: string;
}

type CachorroSomenteLeitura = {
    +readonly [K in keyof Cachorro]~?: Cachorro[k];
}

class MeuCachorrro implements CachorroSomenteLeitura {
    idade;
    nome;

    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

const cao = new MeuCachorrro('apollo', 14);

cao.idade = 8;

console.log(cao)