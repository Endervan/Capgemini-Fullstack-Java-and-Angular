
const  symbol1 = Symbol();
const  symbol2 = Symbol();


// simbols sao unicos
console.log('simbol1 e igual a simbol2',symbol1 === symbol2);

// Previne conflitos entre nomes de propriedades
const namesSymbols1 = Symbol('name');
const namesSymbols2 = Symbol('name');

const user ={
    [namesSymbols1]: 'ender',
    [namesSymbols2]: 'outro nome',
    lastName:'alves da cruz'
}

console.log(user);

// simbols criam propriedades que não são enumberables

for (const key in user){
    if (user.hasOwnProperty(key)){
        console.log(`\n valor da chave ${key}:  ${user[key]}`);
    }
}

