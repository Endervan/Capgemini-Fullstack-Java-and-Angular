// Você terá o desafio de ler um valor inteiro correspondente
// à idade de uma pessoa em dias e informe-a em anos, meses e dias
//
// Obs.: apenas para facilitar o cálculo, considere todo ano
//  com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá
//   uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.

// Exemplo de Entrada	Exemplo de Saída
// 400                  1 ano(s)
//                      1 mes(es)
//                      5 dia(s)



let totalDeDias = parseInt(gets())
// Implemente aqui o cálculo

let ano = parseInt(totalDeDias/365);
let mes = parseInt((totalDeDias%365)/30);
let dia = (totalDeDias%365)%30;
console.log(ano+" ano(s)");
console.log(mes+" mes(es)");
console.log(dia+" dia(s)");
var DIFERENCA = (A * B - C * D);
console.log("DIFERENCA = " + DIFERENCA);
