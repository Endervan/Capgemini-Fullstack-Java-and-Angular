const myNumber = 12.4032;


// Transforma numero pra string
const  numberAsString = myNumber.toString();
console.log('numero transformado em string : ', numberAsString ,typeof  numberAsString);

// Rtorna numero de casas decimais
const  fixedTwoDecimals = myNumber.toFixed(2);
console.log('numero em 2 casas decimais : ',  fixedTwoDecimals);


// Transfoma uma string em float
console.log('\n Strring parseada praa float:', parseFloat('13.20'));

// Transfoma uma string em int
console.log('\n Strring parseada praa int:',  parseInt('13.20'));


