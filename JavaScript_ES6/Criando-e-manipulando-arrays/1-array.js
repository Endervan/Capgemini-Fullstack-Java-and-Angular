const persons = Array.of('ender', 'manu', 'louise');
console.log(persons);

const arrayWithPositions = Array(3);
console.log(arrayWithPositions);

const frutas = Array('mamao', 'tomate', 'banana');
const salgados = Array('kibe', 'cochinha', 'pastel');

// concat cria novo array concatenando entre frutas e salgados
// const allItens = frutas.concat(salgados);
// console.log(allItens);
//
// // slice fatia array
// const fatiaItens = frutas.slice(1, 2);
// console.log('Array fatiado frutas', fatiaItens);
//
// const fatiaItens1 = salgados.slice(2);
// console.log('Array fatiado salgados', fatiaItens1);


// splice removendo array
// const removendoItens = frutas.splice(1, 2);
// console.log('Removendo itens Array ', removendoItens);


// const itens = Array(1,2,3,4);
// // splice adicionando array
// const adicionandoItens = itens.splice(0, 0,'first');
// console.log('Adicionando itens Array ', adicionandoItens);


// const frutas1 = ["amora", ["laranja", ["melancia"], "acerola"]];
//
// console.log(frutas1.flat(2));

const frutas3 = ["melancia", "laranja", "acerola"];

// console.log(frutas3.shift())
console.log(frutas3.pop())