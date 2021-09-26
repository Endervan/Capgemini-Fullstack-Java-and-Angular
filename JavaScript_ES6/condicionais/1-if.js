
//
// if(condicion){
//     //code
// }

const array = [0,1,2,3,4,5];

array.forEach(item=>{
    if (item % 2 === 0){
        console.log(`o numero ${item} e par`);
    }else {
        console.log(`o numero ${item} e impar`);
    }
})