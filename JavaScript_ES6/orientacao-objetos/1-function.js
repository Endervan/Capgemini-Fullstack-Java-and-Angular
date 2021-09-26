// function Pessoa(name) {
//     this.name = name;
// }
//
// const p = new Pessoa('Ender');
// console.log(p);


function Animal(qtdPatas) {
this.qtdpatas = qtdPatas;
}

function Cachorro(morde) {
Animal.call(this,4);
this.morde = morde;

}

const pug = new Cachorro(false);

console.log(pug);