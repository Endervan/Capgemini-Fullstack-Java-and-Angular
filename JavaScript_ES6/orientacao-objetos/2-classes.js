class Animal {
    constructor(qtdPatas) {
    this.qtdpatas = 4;
    }
}

class Cachorro  extends Animal{
    constructor(morde) {
        super(4);
        this.morde = 4;
    }
}

const pug = new Cachorro(false);

console.log(pug)