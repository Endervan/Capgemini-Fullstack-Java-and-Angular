const lines = input.split('\n');
const input = require('fs').readFileSync('/dev/stdin', 'utf8');
contador = 0;
soma = 0;

// for n in range(6){
//     numero = float(input);
//     if (numero > 0.0) {
//         contador += 1;
//         soma += numero;
//     }
// }

console.log(contador + " valores positivos");
console.log("{:1f}".format(soma/contador));