//
// if(condicion){
//     //code
// }elseif(condicion){
// code
//}

const array = [2, 3, 4, 5, 6, 10, 15];

// console.log('\n else if ')
// array.forEach(item => {
//     if (item % 2 === 0) {
//         console.log(`o numero ${item} e par e divisivel por 2`);
//     } else if(item % 3 === 0) {
//         console.log(`o numero ${item} e impar e divisivel por 3`);
//     }else if(item % 5 === 0) {
//         console.log(`o numero ${item} e impar e divisivel por 5`);
//     }
// })

// pega todas condições  nao usa else if somente if
console.log('\n else if ')
array.forEach(item => {
    if (item % 2 === 0) {
        console.log(`o numero ${item} e par e divisivel por 2`);
    }  if(item % 3 === 0) {
        console.log(`o numero ${item} e impar e divisivel por 3`);
    } if(item % 5 === 0) {
        console.log(`o numero ${item} e impar e divisivel por 5`);
    }
})