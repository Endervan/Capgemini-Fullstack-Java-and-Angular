const arr = [1, 2, 3, 4, 5];
//
// arr.forEach((value ,index)=>{
//     console.log(`${index}: ${value}`)
// })

// var arrayMap = arr.map(value => value * 2);
//
// console.log(arrayMap);
//
// const arr1 = [1, 2, 3, [4, 5]];
// console.log('array bidimensional',arr1);
// // flat transforma multi array em um so
// var arrayMesmoNivel = arr.flat(5);

//console.log('array dimensional usando flat',arrayMesmoNivel);

// const arr2 = [1, 2, 3, 4];
// arr2.flatMap(value => [value * 2]);

// const arr3 = [1,2,3,4];
//
// const arrIterator = arr3.values();
// console.log(arrIterator.next())
// console.log(arrIterator.next())
// console.log(arrIterator.next())
// console.log(arrIterator.next())
// console.log(arrIterator.next())

// find buscando elementos;
// const arr4 = [1,2,3,4];
//
// const firsttGreaterThanTwo = arr4.find(value => value>2);
// console.log(firsttGreaterThanTwo);

// findIndex buscando elementos array retorna pelo index;
// const arr5= [1,2,3,4];
// const firsttGreaterThanTwo1 = arr5.findIndex(value => value>2);
// console.log(firsttGreaterThanTwo1);

// filter retorna novo array filtrado elementos
// const arr6= [1,2,3,4];
// const firsttGreaterThanTwo2 = arr6.filter(value => value>2);
// console.log(firsttGreaterThanTwo2);


// indexOf retorna primeiro index em q um elemento pode ser encontrado
// const arr7= [1,3,3,4,3];
// const firsttGreaterThanTwo3 = arr7.indexOf(3);
// console.log(firsttGreaterThanTwo3);

// lastIndexOf retorna ultimo index em q um elemento pode ser encontrado
// const arr8= [1,3,3,4,3];
// const firsttGreaterThanTwo8 = arr8.lastIndexOf(3);
// console.log(firsttGreaterThanTwo8);

// // includes verifica se determinado item existe
// const arr9= [1,3,3,4,3];
// const firsttGreaterThanTwo9 = arr9.includes(3);
// console.log(firsttGreaterThanTwo9);

// some booleano verifica se item array exista
// const arr10= [1,3,3,4,3];
// const firsttGreaterThanTwo10 = arr10.some(value => value%2 ===0);
// console.log(firsttGreaterThanTwo10);


// sort organizar elementos
// const arr11= [1,3,3,4,3];
// const firsttGreaterThanTwo11 = arr11.sort();
// console.log(firsttGreaterThanTwo11);


//reverse reverte os  elementos
// const arr12= [1,3,3,4,3];
// const firsttGreaterThanTwo12 = arr12.reverse();
// console.log(firsttGreaterThanTwo12);

//join transforma array outro tipo de dado
// const arr13= [1,3,3,4,3];
// const firsttGreaterThanTwo13 = arr13.join('-');
// console.log(firsttGreaterThanTwo13);


//reduce retorna um novo tipo dado
const arr14= [1,3,3,4,3];
const firsttGreaterThanTwo14 = arr14.reduce((total,value)=>total+=value,0);
console.log(firsttGreaterThanTwo14);
