// function maisantiga de uso
function fn() {
    return 'code here';
}

const arrawFn = () => 'code here..';
const arrawFn2 = () => {
    // mais expressao
    return 'code here';
};


// funcoes tambem sao objetos

fn.prop = 'posso cria propriedades';

console.log(fn())
console.log(fn.prop)

// receber parametros
const logValue = value => console.log(value);
const logDnResult = fnparam =>console.log(fnparam);