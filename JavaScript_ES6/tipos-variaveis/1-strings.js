
// retorna o tamanho de uma string
const textSize = 'texto'.length;

console.log(`Quantidade de letras :  ${textSize}`)

// retorna um array quebrando a string por um delimitador
const splittedText = 'texto'.split('x');
console.log('\nArray com as posicoes separadas pelo delimitador:',splittedText);

// busca valor e substituir por outro
const replacedText = 'texto'.replace('texto','txet');
console.log('\n Susbstitue um  valor:',replacedText);


// retorna fatia de um valor
const lastChar = 'texto'.slice(-1);
console.log('\nUltima letra de uma string ',lastChar);

const allwithoutLastChar = 'texto'.slice(0,-1);
console.log('\nvalor da string da primeira letra menos a ultima ',allwithoutLastChar);


const secondToEnd = 'texto'.slice(1);
console.log('\nvalor da string da segunda letra menos a ultima ',secondToEnd);


const twoCharBeforeFistPos = 'texto'.substr(0,2);
console.log('\nAs duas letras primeiras sao ',twoCharBeforeFistPos);


