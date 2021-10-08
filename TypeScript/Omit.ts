interface Pessoa {
    nome:string;
    idade:number;
    nacionalidade:string
}

interface Brasileiro extends Omit<Pessoa, 'nacionalidade'>{
    
}

// const brasileiro:Brasileiro={

// }