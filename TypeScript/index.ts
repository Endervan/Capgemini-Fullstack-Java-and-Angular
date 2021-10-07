// function soma(a: number, b: number) {
//     return a + b;
// }

interface IAnimal {
    nome: String,
    tipo: 'terreste' | 'aquático';
    domestico: boolean
}


interface IFelino extends IAnimal {
    visaoNortuna: boolean
}

interface ICanino extends IAnimal {
    porte: 'pequeno' | 'medio' | 'grande';
}

type  IDomestico = IFelino | ICanino


const animal: IDomestico = {
    domestico: true,
    nome: 'cachorro',
    porte: 'medio',
    tipo: 'terreste',
    visaoNortuna:true

}


// animal.executaRugido('s');
//
//
// const felino: IFelino = {
//     nome: 'leão',
//     tipo: 'terreste',
//     visaoNortuna: true
// }